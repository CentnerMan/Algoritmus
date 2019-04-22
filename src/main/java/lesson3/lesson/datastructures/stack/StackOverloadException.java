package ru.geekbrains.datastructures.stack;

public class StackOverloadException extends IndexOutOfBoundsException {

    public StackOverloadException() {
        super("Invalid index for stack");
    }
}
