package lesson5.lesson;

public class Factorial {

    public static void main(String[] args) {
        //5! = 5 * 4 * 3 * 2 * 1 = 120
        //2! = 2 * 1 = 2
        //1! = 1
        System.out.println(factorial(5));
    }

    private static int factorial(int n) {
        if (n == 1) {
            return 1;
        }

        return n * factorial(n - 1);
    }
}
