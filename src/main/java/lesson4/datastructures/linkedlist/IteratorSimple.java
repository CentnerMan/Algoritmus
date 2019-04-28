package lesson4.datastructures.linkedlist;

import java.util.Iterator;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 28.04.2019
 * @link https://github.com/Centnerman
 */

public class IteratorSimple<E> implements Iterator<E> {

    private SimpleLinkedListImpl list;
    private Entry<E> current;
    private Entry<E> next;
    private static int currentPosition = 0;

//    private int size;

    public IteratorSimple(SimpleLinkedListImpl<E> list) {
        this.list = list;
        current = list.firstElement;
        next = null;
    }

    public void nextLink() {
        current = current.getNext();
        next = next.getNext();
        currentPosition++;
    }

    @Override
    public boolean hasNext() {
        if (currentPosition < list.size && current.getNext() != null) return true;
        return false;
    }

    @Override
    public E next() {
        if (hasNext()) {
            return current.getNext().getValue();
        }
        return null;
    }

    @Override
    public void forEachRemaining(Consumer<? super E> action) {
        Objects.requireNonNull(action);
        current = list.firstElement;
        while (hasNext()) {
            action.accept(current.getValue());
            nextLink();
        }
    }
}
