package ru.geekbrains.datastructures.stack.brackets;

public class TestBrackets {

    public static void main(String[] args) {
        String input = "    private static void removeIfNotEmpty(Stack<Integer> stack) {        if ( !stack.isEmpty() ) {            System.out.println(stack.pop());        }    }";
        new Brackets(input).check();
    }
}
