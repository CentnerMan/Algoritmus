package lesson6.lesson;

import java.util.Stack;

public class TreeImpl<E extends Comparable<? super E>> implements Tree<E> {

    private Node<E> root;
    private static int currentDepth = 1;

    public static int getCurrentDepth() {
        return currentDepth;
    }

    public static void setCurrentDepth(int currentDepth) {
        TreeImpl.currentDepth = currentDepth;
    }

    public Node<E> getRoot() {
        return root;
    }

    @Override
    public boolean add(E value) {
        if (isEmpty()) {
            root = new Node<>(value);
            return true;
        }
        setCurrentDepth(1);
        NodeAndPrevious nodeAndPrevious = doFind(value);
        Node<E> previous = nodeAndPrevious.previous;

        if (previous.shouldBeLeft(value)) {
            previous.setLeftChild(new Node<>(value));
        } else {
            previous.setRightChild(new Node<>(value));
        }

        return true;
    }


    @Override
    public boolean remove(E value) {
        NodeAndPrevious nodeAndPrevious = doFind(value);
        Node<E> removedNode = nodeAndPrevious.current;
        Node<E> parent = nodeAndPrevious.previous;

        if (removedNode == null) {
            return false;
        }

        if (removedNode.isLeaf()) {
            removeLeaf(removedNode, parent);
        } else if (hasOnlySingleChildNode(removedNode)) {
            removeNodeWithSingleChild(removedNode, parent);
        } else {
            removeCommonNode(removedNode, parent);
        }

        return false;
    }

    private void removeCommonNode(Node<E> removedNode, Node<E> parent) {
        Node<E> successor = getSuccessor(removedNode);
        if (removedNode == root) {
            root = successor;
        } else if (parent.getLeftChild() == removedNode) {
            parent.setLeftChild(successor);
        } else {
            parent.setRightChild(successor);
        }
        successor.setLeftChild(removedNode.getLeftChild());
    }

    private void removeNodeWithSingleChild(Node<E> removedNode, Node<E> parent) {
        Node<E> childNode = removedNode.getLeftChild() != null
                ? removedNode.getLeftChild()
                : removedNode.getRightChild();


        if (removedNode == root) {
            root = childNode;
        } else if (parent.getLeftChild() == removedNode) {
            parent.setLeftChild(childNode);
        } else {
            parent.setRightChild(childNode);
        }
    }

    private void removeLeaf(Node<E> removedNode, Node<E> parent) {
        if (removedNode == root) {
            root = null;
        } else if (parent.getLeftChild() == removedNode) {
            parent.setLeftChild(null);
        } else {
            parent.setRightChild(null);
        }
    }

    private Node<E> getSuccessor(Node<E> removedNode) {
        Node<E> successor = removedNode;
        Node<E> successorParent = null;
        Node<E> current = removedNode.getRightChild();

        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.getLeftChild();
        }

        if (successor != removedNode.getRightChild()) {
            successorParent.setLeftChild(successor.getRightChild());
            successor.setRightChild(removedNode.getRightChild());
        }

        return successor;

    }

    private boolean hasOnlySingleChildNode(Node<E> currentNode) {
        return currentNode.getLeftChild() != null ^ currentNode.getRightChild() != null;
    }

    @Override
    public boolean find(E value) {
        NodeAndPrevious nodeAndPrevious = doFind(value);
        return nodeAndPrevious.current != null;
    }

    private NodeAndPrevious doFind(E value) {
        int currentDepth = 1;
        Node<E> previous = null;
        Node<E> current = root;

        while (current != null) {
            if (current.getValue().equals(value)) {
                return new NodeAndPrevious(current, previous);
            }
            previous = current;
            currentDepth++;
            if (current.shouldBeLeft(value)) {
                current = current.getLeftChild();
            } else {
                current = current.getRightChild();
            }
        }
        setCurrentDepth(currentDepth);
        return new NodeAndPrevious(null, previous);
    }


    @Override
    public boolean isEmpty() {
        return root == null;
    }

    @Override
    public void display() {
        Stack<Node> globalStack = new Stack<>();
        globalStack.push(root);
        int nBlanks = 64;

        boolean isRowEmpty = false;
        System.out.println(".............................................................................................................................");

        while (!isRowEmpty) {
            Stack<Node> localStack = new Stack<>();

            isRowEmpty = true;
            for (int i = 0; i < nBlanks; i++) {
                System.out.print(" ");
            }

            while (!globalStack.isEmpty()) {
                Node tempNode = globalStack.pop();
                if (tempNode != null) {
                    System.out.print(tempNode.getValue());
                    localStack.push(tempNode.getLeftChild());
                    localStack.push(tempNode.getRightChild());
                    if (tempNode.getLeftChild() != null || tempNode.getRightChild() != null) {
                        isRowEmpty = false;
                    }
                } else {
                    System.out.print("--");
                    localStack.push(null);
                    localStack.push(null);
                }
                for (int j = 0; j < nBlanks * 2 - 2; j++) {
                    System.out.print(" ");
                }
            }

            System.out.println();

            while (!localStack.isEmpty()) {
                globalStack.push(localStack.pop());
            }

            nBlanks /= 2;
        }
        System.out.println(".............................................................................................................................");
    }

    @Override
    public void traverse(TraverseMode traverseMode) {
        switch (traverseMode) {
            case IN_ORDER:
                inOrder(root);
                break;
            case PRE_ORDER:
                preOrder(root);
                break;
            case POST_ORDER:
                postOrder(root);
                break;
            default:
                throw new IllegalArgumentException("Unknown traverse mode " + traverseMode);
        }
    }

    private void postOrder(Node<E> node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeftChild());
        inOrder(node.getRightChild());
        System.out.println(node);
    }

    private void preOrder(Node<E> node) {
        if (node == null) {
            return;
        }
        System.out.println(node);
        inOrder(node.getLeftChild());
        inOrder(node.getRightChild());
    }

    private void inOrder(Node<E> node) {
        if (node == null) {
            return;
        }
        inOrder(node.getLeftChild());
        System.out.println(node);
        inOrder(node.getRightChild());
    }

    class NodeAndPrevious {
        Node<E> current;
        Node<E> previous;

        public NodeAndPrevious(Node<E> current, Node<E> previous) {
            this.current = current;
            this.previous = previous;
        }
    }

    public static boolean isBalanced(Node node) {
        return (node == null) ||
                isBalanced(node.leftChild) &&
                        isBalanced(node.rightChild) &&
                        Math.abs(height(node.leftChild) - height(node.rightChild)) <= 1;
    }

    private static int height(Node node) {
        return node == null ? 0 : 1 + Math.max(height(node.leftChild), height(node.rightChild));
    }

}
