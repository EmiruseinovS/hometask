package task39;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите переменную a: ");
        int a = task.nextInt();
        System.out.println("Введите переменную b: ");
        int b = task.nextInt();
        long sum = 0;
        for (int i = a; i < b; i++) {
            System.out.println("Сумма квадратов равна: " + (sum += i * i));
        }
    }
}
