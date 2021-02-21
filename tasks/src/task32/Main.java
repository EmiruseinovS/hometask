package task32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите число А: ");
        int a = task.nextInt();
        System.out.println("Введите число В: ");
        int b = task.nextInt();
        int score = 0;
        for (int i = a; i  <= b; i++) {
            score++;
            System.out.println(i);
        }
        System.out.println("Количество чисел: " + score);
    }
}
