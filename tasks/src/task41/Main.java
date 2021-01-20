package task41;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите переменную n: ");
        double n = task.nextDouble();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(sum += ((n + i) * (n + i)));
        }
    }
}
