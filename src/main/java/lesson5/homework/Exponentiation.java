package lesson5.homework;

/**
 * Java, Algoritmus.
 *
 * @author Anatoly Lebedev
 * @version 1.0.0 01.05.2019
 * @link https://github.com/Centnerman
 */

//1.	Написать программу по возведению числа в степень с помощью рекурсии.

public class Exponentiation {
    public static void main(String[] args) {
        System.out.println(exp(2, 10));
        System.out.println(exp(3, 3));
        System.out.println(exp(4, 6));
        System.out.println(exp(3, -1));
        System.out.println(exp(25, 0));
    }

    public static int exp(int n, int x) {
        if (x < 0) {
            return 0; // На самом деле, конечно, 1/n^x, но тут мы целое число не получим :)
        }
        if (x == 0) {
            return 1; // Собственно, любое число в 0 степени есть 1 :)
        }
        x--;
        if (x == 0) {
            return n;
        }
        return n * exp(n, x);
    }
}
