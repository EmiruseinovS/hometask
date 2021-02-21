package task40;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите переменную n: ");
        double n = task.nextDouble();
        double sum = 0;
        for(int i = 1; i <= n; i++) {
            sum = sum + 1 / (double)i;
        }
        System.out.println(sum);
    }
}