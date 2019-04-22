package lesson3.lesson.datastructures.deque;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 23.04.2019
 * @link https://github.com/Centnerman
 */

public class DequeExample {
    public static void main(String[] args) {
        Deque<Integer> deque = new DequeImpl<>(3);
        addLeftIfNotFull(deque, 2);
        addLeftIfNotFull(deque, 1);
        addRightIfNotFull(deque, 3);
        addRightIfNotFull(deque, 4);

        removeLeftIfNotEmpty(deque);
        removeLeftIfNotEmpty(deque);
        removeLeftIfNotEmpty(deque);
        removeRightIfNotEmpty(deque);
        removeRightIfNotEmpty(deque);
        removeLeftIfNotEmpty(deque);
        removeLeftIfNotEmpty(deque);
    }

    private static void removeLeftIfNotEmpty(Deque<Integer> deque) {
        if ( !deque.isEmpty() ) {
            System.out.println(deque.removeLeft());
        }
    }

    private static void removeRightIfNotEmpty(Deque<Integer> deque) {
        if ( !deque.isEmpty() ) {
            System.out.println(deque.removeRight());
        }
    }

    private static void addLeftIfNotFull(Deque<Integer> deque, int value) {
        if ( !deque.isFull() ) {
            deque.insertLeft(value);
        }
    }

    private static void addRightIfNotFull(Deque<Integer> deque, int value) {
        if ( !deque.isFull() ) {
            deque.insertRight(value);
        }
    }
}
