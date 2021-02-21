package task67;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("n: ");
        int n = task.nextInt();
        int[] array = new int[n];
        for (int i = n + 1; i > 0; i--) {
            array[i] = i;
            System.out.println("array[" + array[i] + "]=" + i);
        }
    }
}
