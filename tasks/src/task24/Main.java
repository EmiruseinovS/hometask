package task24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите A: ");
        int a = task.nextInt();
        System.out.println("Введите B: ");
        int b = task.nextInt();
        if(a > b)
            System.out.println("A = " + b + ", B = " + a);
        else if(a < b)
            System.out.println("A = " + a + ", B = " + b);
        else
            System.out.println("A = B = " + a);
    }
}
