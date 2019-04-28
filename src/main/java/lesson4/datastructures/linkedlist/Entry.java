package lesson4.datastructures.linkedlist;

public interface Entry<T> {

    T getValue();

    Entry<T> getNext();

    void setNext(Entry<T> nextElement);
}
