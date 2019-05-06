package lesson2;

/**
 * Java, algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 16.04.2019
 * @link https://github.com/Centnerman
 */

public class Main {
    public static final int CAPACITY = 1000000;

    public static void main(String[] args) {

        ArrayInt arr1 = new ArrayInt(CAPACITY);
        for (int i = 0; i < CAPACITY; i++) arr1.insert((int) (Math.random() * Integer.MAX_VALUE));

        // Начало отсчета сортировки пузырьком
        long start = System.currentTimeMillis();

        arr1.sortBubbleInt(); // сортируем

        long timeToSort = System.currentTimeMillis() - start;
        // Вывод времени выполнения работы кода на экран
        System.out.println("Скорость выполнения пузырьковой сортировки: " + timeToSort + " миллисекунд");

//------------------------------------------------------------------------------------------------------------

        ArrayInt arr2 = new ArrayInt(CAPACITY);
        for (int i = 0; i < CAPACITY; i++) arr2.insert((int) (Math.random() * Integer.MAX_VALUE));

        // Начало отсчета сортировки выбором
        start = System.currentTimeMillis();

        arr2.sortSelectInt(); // сортируем

        timeToSort = System.currentTimeMillis() - start;
        // Вывод времени выполнения работы кода на экран
        System.out.println("Скорость выполнения сортировки выбором: " + timeToSort + " миллисекунд");


//------------------------------------------------------------------------------------------------------------

        ArrayInt arr3 = new ArrayInt(CAPACITY);
        for (int i = 0; i < CAPACITY; i++) arr3.insert((int) (Math.random() * Integer.MAX_VALUE));

        // Начало отсчета сортировки вставкой
        start = System.currentTimeMillis();

        arr3.sortInsertObjectInt(); // сортируем

        timeToSort = System.currentTimeMillis() - start;

        System.out.println("Скорость выполнения сортировки вставкой: " + timeToSort + " миллисекунд");

    }
}
