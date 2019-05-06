package lesson2.lesson;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArrayTestCase {

    @Test
    public void test_create_array() {
        Assertions.assertArrayEquals(
                new Integer[ArrayImpl.DEFAULT_CAPACITY],
                new ArrayImpl<Integer>().data);

        Assertions.assertArrayEquals(
                new Integer[10],
                new ArrayImpl<Integer>(10).data);
    }

    @Test
    public void test_add() {
        Array<Integer> array = new ArrayImpl<>(5);

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        Assertions.assertArrayEquals(
                new Integer[]{1, 2, 3, 4, 5},
                ((ArrayImpl<Integer>) array).data
        );

        array.add(6);


        Assertions.assertEquals("1, 2, 3, 4, 5, 6", array.toString());
    }


    @Test
    public void test_remove() {
        Array<Integer> array = new ArrayImpl<>(5);

        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);

        Assertions.assertEquals(
                "1, 2, 3, 4, 5",
                array.toString());


        array.remove(array.size() - 1);
        array.remove(0);
        array.remove(Integer.valueOf(3));


        Assertions.assertEquals("2, 4", array.toString());
    }


    @Test
    public void test_sorted_array() {
        Array<Integer> array = new SortedArrayImpl<>();
        array.add(5);
        array.add(3);
        array.add(1);
        array.add(4);
        array.add(2);


        Assertions.assertEquals(
                "1, 2, 3, 4, 5",
                array.toString());

        Assertions.assertTrue(array.contains(1));
        Assertions.assertTrue(array.contains(5));
        Assertions.assertTrue(array.contains(3));
        Assertions.assertFalse(array.contains(33));
    }

    @Test
    public void test_sort_bubble() {
        Array<Integer> array = new ArrayImpl<>();
        array.add(5);
        array.add(3);
        array.add(1);
        array.add(4);
        array.add(2);


        Assertions.assertEquals(
                "5, 3, 1, 4, 2",
                array.toString());

        array.sortBubble();

        Assertions.assertEquals(
                "1, 2, 3, 4, 5",
                array.toString());
    }


    @Test
    public void test_sort_select() {
        Array<Integer> array = new ArrayImpl<>();
        array.add(5);
        array.add(3);
        array.add(1);
        array.add(4);
        array.add(2);


        Assertions.assertEquals(
                "5, 3, 1, 4, 2",
                array.toString());

        array.sortSelect();

        Assertions.assertEquals(
                "1, 2, 3, 4, 5",
                array.toString());
    }

    @Test
    public void test_sort_insert() {
        Array<Integer> array = new ArrayImpl<>();
        array.add(5);
        array.add(3);
        array.add(1);
        array.add(4);
        array.add(2);


        Assertions.assertEquals(
                "5, 3, 1, 4, 2",
                array.toString());

        array.sortInsert();

        Assertions.assertEquals(
                "1, 2, 3, 4, 5",
                array.toString());
    }


}
