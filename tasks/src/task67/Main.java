package task67;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("n: ");
        int n = task.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n ; i++) {
            array[i] = n - i;
            System.out.println("array[" + array[i]);
            for (int j = n; j >= 1; j--) {
                System.out.print("]=" + j);
            }
        }
    }
}

