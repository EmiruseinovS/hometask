package task44;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите n:");
        int n = task.nextInt();
        long res = n * n;
        for (int i = 1; i < res; i+=2) {
            System.out.println(i);
        }
        System.out.println(res);
    }
}
