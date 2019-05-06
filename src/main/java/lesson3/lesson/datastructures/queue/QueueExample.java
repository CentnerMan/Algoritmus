package lesson3.lesson.datastructures.queue;

public class QueueExample {

    public static void main(String[] args) {
//        Queue<Integer> queue = new QueueImpl<>(3);
        Queue<Integer> queue = new PriorityQueue<>(3);
        addIfNotFull(queue, 3);
        addIfNotFull(queue, 1);
        addIfNotFull(queue, 4);
        addIfNotFull(queue, 2);

        removeIfNotEmpty(queue);
        removeIfNotEmpty(queue);
        removeIfNotEmpty(queue);
        removeIfNotEmpty(queue);
        removeIfNotEmpty(queue);
        removeIfNotEmpty(queue);
        removeIfNotEmpty(queue);
    }

    private static void removeIfNotEmpty(Queue<Integer> stack) {
        if ( !stack.isEmpty() ) {
            System.out.println(stack.remove());
        }
    }

    private static void addIfNotFull(Queue<Integer> stack, int value) {
        if ( !stack.isFull() ) {
            stack.insert(value);
        }
    }
}
