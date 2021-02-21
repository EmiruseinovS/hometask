package task46;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите a: ");
        int a = task.nextInt();
        System.out.println("Введите b: ");
        int b = task.nextInt();
        int c = 1;
        while(a - b * c > 0) {
            c++;
            a = a - b;
        }
        System.out.println(a);
    }
}
