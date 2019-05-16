package lesson7.homework;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 12.05.2019
 * @link https://github.com/Centnerman
 */

public class Stack {
    private int maxSize;
    private int[] stackArr;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        this.stackArr = new int[size];
        this.top = -1;
    }

    public void push(int i) {
        stackArr[++top] = i;
    }

    public int pop() {
        return stackArr[top--];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public int peek() {
        return stackArr[top];
    }

}
