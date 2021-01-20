package task40;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите переменную n: ");
        double n = task.nextDouble();
        double sum = 0;
        for(int i = 1; i < n; i++) {
            System.out.println(sum += n/i);
        }
    }
}
/* Дано целое число N (> 0). Найти сумму
1 + 1/2 + 1/3 + . . . + 1/N */