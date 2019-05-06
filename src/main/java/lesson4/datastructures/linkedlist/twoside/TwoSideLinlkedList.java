package lesson4.datastructures.linkedlist.twoside;

import lesson4.datastructures.linkedlist.LinkedList;

public interface TwoSideLinlkedList<E> extends LinkedList<E> {

    void insertLeft(E value);

    void insertRight(E value);

    E removeLeft();

}
