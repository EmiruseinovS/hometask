package task50;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите N: ");
        int n = task.nextInt();
        int divider = 2;
        int a = 2;
        int k = 1;
        while(n / divider > 1) {
            divider *= a;
            ++k;
        }
        System.out.println(n + " это 2 в " + k + " степени");
    }
}
