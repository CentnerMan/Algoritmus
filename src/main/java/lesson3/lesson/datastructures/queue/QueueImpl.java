package lesson3.lesson.datastructures.queue;

public class QueueImpl<E> implements Queue<E> {

    public static final int DEFAULT_FRONT = 0;
    public static final int DEFAULT_REAR = -1;

    protected E[] data;
    protected int size;

    private int front;
    private int rear;

    @SuppressWarnings("unchecked")
    public QueueImpl(int maxSize) {
        this.data = (E[]) new Object[maxSize];
        front = DEFAULT_FRONT;
        rear = DEFAULT_REAR;
    }

    protected QueueImpl(E[] data) {
        this.data = data;
    }


    @Override
    public void insert(E value) {
        if (isFull()) {
            throw QueueOverloadException.queueIsFull();
        }

        if (rear == data.length - 1) {
            rear = DEFAULT_REAR;
        }
        data[++rear] = value;
        size++;
    }

    @Override
    public E remove() {
        if (isEmpty()) {
            throw QueueOverloadException.queueIsEmpty();
        }

        if (front == data.length) {
            front = DEFAULT_FRONT;
        }
        E removedValue = data[front++];
        size--;
        return removedValue;
    }

    @Override
    public E peek() {
        return data[front];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public int getSize() {
        return size;
    }
}
