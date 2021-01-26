package task42;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите количество множителей:");
        double n = task.nextInt();
        double mul = 1;
        for (double i = 1; i <= n ; i++) {
            mul = mul * (1 + i / 10);
        }
        System.out.println("Произведение = " + mul);
    }
}