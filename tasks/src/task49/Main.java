package task49;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите N: ");
        double  n = task.nextInt();
        int a = 3;
        int divider = 3;
        while (n / divider > 1) {
            divider = divider * a;
        }
        System.out.println(n / divider == 1);
    }
}
