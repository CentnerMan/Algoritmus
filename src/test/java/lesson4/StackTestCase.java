package lesson4;

import lesson3.lesson.datastructures.stack.Stack;
import lesson4.datastructures.linkedlist.LinkedStackImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.LinkedList;

public class StackTestCase {


    private Stack<Integer> stack;

    @BeforeEach
    public void prepare() {
        stack = new LinkedStackImpl<>();
    }

    @Test
    public void test_create_stack() {
        Assertions.assertNotNull(stack);
    }

    @Test
    public void test_add_to_stack() {
        stack.push(1);
        Assertions.assertEquals(1, stack.peek());
    }

    @Test
    public void test_remove() {
        stack.push(1);
        Assertions.assertEquals(1, stack.pop());
        Assertions.assertEquals(0, stack.getSize());
        Assertions.assertTrue(stack.isEmpty());
        Assertions.assertFalse(stack.isFull());
    }

    @Test
    public void test_display() {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        StringBuilder sb = new StringBuilder();

        while ( !stack.isEmpty() ) {
            sb.append(stack.pop());
        }

        Assertions.assertEquals("54321", sb.toString());
    }

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        for (Integer integer : linkedList) {
            System.out.println(linkedList);
        }

    }

}
