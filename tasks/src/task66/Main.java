package task66;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("n: ");
        int n = task.nextInt();
        System.out.println("a: ");
        int a = task.nextInt();
        System.out.println("b: ");
        int b = task.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = a + b;
            b += a;
            a = array[i];
            System.out.println("array[" + i + "]=" + array[i]);
        }
    }
}
