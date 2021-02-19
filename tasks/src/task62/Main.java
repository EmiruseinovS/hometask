package task62;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("n: ");
        int n = task.nextInt();
        int a = 1;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = a * 2;
            a = array[i];
            System.out.println("array[" + i + "]=" + array[i]);
        }
    }
}
