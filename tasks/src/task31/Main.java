package task31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int N = task.nextInt();
        System.out.println("Введите число К: ");
        int K = task.nextInt();
        for(int A = 0;A < N ; A++)
            System.out.println(K);
    }
}
