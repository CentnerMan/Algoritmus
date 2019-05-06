package lesson5.lesson;

import lesson2.lesson.Array;
import lesson2.lesson.SortedArrayImpl;

public class RecSortedArrayImpl<E extends Object & Comparable<? super E>> extends SortedArrayImpl<E> {

    public static void main(String[] args) {
        Array<Integer> array = new SortedArrayImpl<>();
        array.add(20);
        array.add(10);
        array.add(70);

        System.out.println(array.contains(10));
        System.out.println(array.contains(20));
        System.out.println(array.contains(70));
        System.out.println(array.contains(777));

        System.out.println(array.indexOf(10));
        System.out.println(array.indexOf(20));
        System.out.println(array.indexOf(70));
        System.out.println(array.indexOf(777));

    }

    @Override
    public int indexOf(E value) {
        int low = 0;
        int high = currentSize - 1;
        return recBinaryFind(value, low, high);
    }

    private int recBinaryFind(E value, int low, int high) {
        int mid = (low + high) / 2;

        if (low > high) {
            return -1;
        }

        if ( data[mid].equals(value) ) {
            return mid;
        }

        if ( value.compareTo(data[mid]) > 0 ) {
            return recBinaryFind(value, mid + 1, high);
        }
        else {
            return recBinaryFind(value, low, mid - 1);
        }


    }
}
