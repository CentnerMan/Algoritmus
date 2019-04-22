package lesson3.lesson.datastructures.queue;

public class QueueOverloadException extends RuntimeException {

    public static QueueOverloadException queueIsEmpty() {
        return new QueueOverloadException("Queue is empty!");
    }

    public static QueueOverloadException queueIsFull() {
        return new QueueOverloadException("Queue is full!");
    }

    private QueueOverloadException(String message) {
        super(message);
    }
}
