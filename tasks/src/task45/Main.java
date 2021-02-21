package task45;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = task.nextInt();
        System.out.println("Введите a: ");
        int a = task.nextInt();
        long mul = 1;
        for(int i = 0; i < n ; i++) {
            mul *= a;
        }
        System.out.println(mul);
    }
}
