package ru.geekbrains.datastructures.queue;

public interface Queue<E> {

    void insert(E value);

    E remove();

    E peek();

    boolean isEmpty();
    boolean isFull();

    int getSize();
}
