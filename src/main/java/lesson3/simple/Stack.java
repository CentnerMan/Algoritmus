package lesson3.simple;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 23.04.2019
 * @link https://github.com/Centnerman
 */

public class Stack {
    private int maxSize;
    private int[] stack;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stack = new int[maxSize];
        this.top = -1;
    }

    public void push(int i) {
        stack[++top] = i;
    }

    public int pop() {
        return stack[top--];
    }

    public int peek() {
        return stack[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

}
