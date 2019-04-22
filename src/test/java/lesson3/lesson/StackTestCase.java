package lesson3.lesson;

import lesson3.lesson.datastructures.stack.Stack;
import lesson3.lesson.datastructures.stack.StackImpl;
import lesson3.lesson.datastructures.stack.StackOverloadException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StackTestCase {


    @Test
    public void test_create_stack() {
        Stack<Integer> stack = new StackImpl<>(5);
        Assertions.assertNotNull(stack);
    }

    @Test
    public void test_add_to_stack() {
        Stack<Integer> stack = new StackImpl<>(1);
        stack.push(1);
        Assertions.assertEquals(1, stack.peek());
    }

    @Test
    public void test_add_element_to_full_stack() {
        Stack<Integer> stack = new StackImpl<>(1);
        stack.push(1);
        Assertions.assertThrows(StackOverloadException.class, () -> {
            stack.push(2);
        });
    }

    @Test
    public void test_remove() {
        Stack<Integer> stack = new StackImpl<>(1);
        stack.push(1);
        Assertions.assertEquals(1, stack.pop());
        Assertions.assertEquals(0, stack.getSize());
        Assertions.assertTrue(stack.isEmpty());
        Assertions.assertFalse(stack.isFull());
    }

    @Test
    public void test_display() {
        Stack<Integer> stack = new StackImpl<>(5);
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


}
