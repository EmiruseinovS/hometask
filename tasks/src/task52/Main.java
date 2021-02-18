package task52;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = task.nextInt();
        int k = 1;
        while(k * k < n) {
            k++;
        }
        System.out.println(k);
    }
}
