package task55;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("n: ");
        int n = task.nextInt();
        int a = 3;
        int b = a;
        int k = 1;
        while (a * b < n) {
            a *= b;
            k++;
        }
        System.out.println(k);
    }
}
