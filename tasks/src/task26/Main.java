package task26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите A: ");
        int a = task.nextInt();
        System.out.println("Введите B: ");
        int b = task.nextInt();
        if (a != b & a > b)
            b = a;
        else if (a != b & a < b)
            a = b;
        else if (a == b)
            a = b = 0;
        System.out.println(a + " " + b);
    }
}
