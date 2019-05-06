package lesson3.lesson.datastructures.deque;

import lesson3.lesson.datastructures.queue.QueueImpl;
import lesson3.lesson.datastructures.queue.QueueOverloadException;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 22.04.2019
 * @link https://github.com/Centnerman
 */

public class DequeImpl<E> extends QueueImpl<E> implements Deque<E> {

    public DequeImpl(int maxSize) {
        super(maxSize);
    }

    protected DequeImpl(E[] data) {
        super(data);
    }

// ----------------------------------------------------------------------------------------------------------

    @Override
    public void insertLeft(E value) {
        if (isFull()) {
            throw QueueOverloadException.queueIsFull();
        }

        if (front > 0) {
            front--;
            data[front] = value;
        } else if (front == 0) {
            front = data.length;
            data[--front] = value;
        }
        size++;
    }

// ----------------------------------------------------------------------------------------------------------

    // Берем из очереди
    @Override
    public void insertRight(E value) {
        insert(value);
    }

// ----------------------------------------------------------------------------------------------------------

    // берем из очереди
    @Override
    public E removeLeft() {
        return remove();
    }

// ----------------------------------------------------------------------------------------------------------

    @Override
    public E removeRight() {
        if (isEmpty()) {
            throw QueueOverloadException.queueIsEmpty();
        }

        if (rear < DEFAULT_FRONT) rear = data.length - 1;
        E removedValue = data[rear--];
        size--;
        return removedValue;
    }

// ----------------------------------------------------------------------------------------------------------

    @Override
    public E peekLeft() {
        return data[front];
    }

// ----------------------------------------------------------------------------------------------------------

    @Override
    public E peekRight() {
        return data[rear];
    }
}
