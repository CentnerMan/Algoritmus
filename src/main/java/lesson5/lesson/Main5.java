package lesson5.lesson;

public class Main5 {

    public static void main(String[] args) {
//        countDownLoop(5);
        countDownRec(5);
    }

    private static void countDownRec(int n) {
        if (n < 0) {
            return;
        }
        System.out.println(n);
        countDownRec(n - 1);
    }

    private static void countDownLoop(int n) {
        while (n >= 0) {
            System.out.println(n);
            n--;
        }
    }
}
