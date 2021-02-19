package task64;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("n: ");
        int n = task.nextInt();
        System.out.println("a: ");
        int a = task.nextInt();
        System.out.println("d: ");
        int d = task.nextInt();
        int[] array = new int[n];
        for (int i = 1; i < n; i++) {
            array[i] = a * d;
            a = array[i];
            System.out.println("array[" + i + "]=" + array[i]);
        }
    }
}
