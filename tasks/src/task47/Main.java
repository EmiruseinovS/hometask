package task47;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = task.nextInt();
        System.out.println("Введите b: ");
        int b = task.nextInt();
        int x = 0;
        int y = a;
        while (a - b <= 0) {
            x = x - b;
            ++x;
        }
        System.out.println(x);
    }
}