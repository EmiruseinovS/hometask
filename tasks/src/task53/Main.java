package task53;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task= new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = task.nextInt();
        int k = n;
        while(n < k * k) {
            k--;
        }
        System.out.println(k);
    }
}
