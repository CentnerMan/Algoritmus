package lesson3.lesson.datastructures.deque;

import lesson3.lesson.datastructures.queue.Queue;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 22.04.2019
 * @link https://github.com/Centnerman
 */

public interface Deque<E> extends Queue<E> {

    void insertLeft(E value);

    void insertRight(E value);

    E removeLeft();

    E removeRight();

    E peekLeft();

    E peekRight();

}
