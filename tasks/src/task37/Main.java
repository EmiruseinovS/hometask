package task37;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите переменную А: ");
        int a = task.nextInt();
        System.out.println("Введите переменную В: ");
        int b = task.nextInt();
        long sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}