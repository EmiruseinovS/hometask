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
        for (long i = a; i <= b; i++) {
            sum += i * i;
        }
        System.out.println(sum);
    }
}
