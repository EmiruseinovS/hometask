package task65;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("n: ");
        int n = task.nextInt();
        int n1 = 1;
        int n2 = 1;
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = n1 + n2;
            n1 = n2;
            n2 = array[i];
            System.out.println("array[" + i + "]=" + array[i]);
        }
    }
}
