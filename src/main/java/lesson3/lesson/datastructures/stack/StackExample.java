package ru.geekbrains.datastructures.stack;

public class StackExample {

    public static void main(String[] args) {
        Stack<Integer> stack = new StackImpl<>(3);
        addIfNotFull(stack, 1);
        addIfNotFull(stack, 2);
        addIfNotFull(stack, 3);
        addIfNotFull(stack, 4);

        removeIfNotEmpty(stack);
        removeIfNotEmpty(stack);
        removeIfNotEmpty(stack);
        removeIfNotEmpty(stack);
        removeIfNotEmpty(stack);
        removeIfNotEmpty(stack);
        removeIfNotEmpty(stack);
    }

    private static void removeIfNotEmpty(Stack<Integer> stack) {
        if ( !stack.isEmpty() ) {
            System.out.println(stack.pop());
        }
    }

    private static void addIfNotFull(Stack<Integer> stack, int value) {
        if ( !stack.isFull() ) {
            stack.push(value);
        }
    }
}
