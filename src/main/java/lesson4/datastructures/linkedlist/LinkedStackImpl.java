package lesson4.datastructures.linkedlist;

import lesson3.lesson.datastructures.stack.Stack;


public class LinkedStackImpl<E> implements Stack<E>{

    private LinkedList<E> data;

    public LinkedStackImpl() {
        this.data = new SimpleLinkedListImpl<>();
    }

    @Override
    public void push(E value) {
        data.insert(value);
    }

    @Override
    public E pop() {
        return data.remove();
    }

    @Override
    public E peek() {
        return data.getFirstElement();
    }

    @Override
    public boolean isEmpty() {
        return data.isEmpty();
    }

    @Override
    public boolean isFull() {
        return false;
    }

    @Override
    public int getSize() {
        return data.getSize();
    }

}
