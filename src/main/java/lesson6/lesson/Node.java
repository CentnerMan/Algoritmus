package lesson6.lesson;

import java.util.Objects;

public class Node<T extends Comparable<? super T>> {

    private final T value;

    protected Node<T> leftChild;
    protected Node<T> rightChild;


    public Node(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public Node<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
        this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
        this.rightChild = rightChild;
    }


    public boolean shouldBeLeft(T anotherValue) {
        if (anotherValue == null) {
            throw new IllegalArgumentException("Not null value is required");
        }
        return anotherValue.compareTo(value) < 0;
    }

    public boolean isLeaf() {
        return leftChild == null && rightChild == null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Node<?> node = (Node<?>) o;
        return Objects.equals(value, node.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                '}';
    }

}
