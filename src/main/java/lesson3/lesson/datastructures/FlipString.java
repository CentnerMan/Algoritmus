package lesson3.lesson.datastructures;

import lesson3.lesson.datastructures.stack.Stack;
import lesson3.lesson.datastructures.stack.StackImpl;

import java.util.Scanner;

public class FlipString {
    public static void main(String[] args) {

        String inputStr, outputStr = "";
        Scanner sc = new Scanner(System.in);

        Stack flip = new StackImpl(512);

        System.out.println("Введите строку для разворота:");
        inputStr = sc.nextLine();

        // Заводим в стек посимвольно
        for (int i = 0; i < inputStr.length(); i++) {
            flip.push(inputStr.charAt(i));
        }

        // Выводим из стека посимвольно, пока не опустошим стек
        while (!flip.isEmpty()) {
            outputStr = outputStr + flip.pop();
        }
        System.out.println(outputStr);

        sc.close();
    }
}
