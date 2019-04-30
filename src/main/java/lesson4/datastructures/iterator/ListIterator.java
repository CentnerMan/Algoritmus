package lesson4.datastructures.iterator;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 30.04.2019
 * @link https://github.com/Centnerman
 */

import java.util.Iterator;

public interface ListIterator<E> extends Iterator<E> {

    void reset();

    void insertBefore(E value);

    void insertAfter(E value);

}