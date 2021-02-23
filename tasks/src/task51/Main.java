package task51;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите N: ");
        int n = task.nextInt();
        int factorial = 1;
        int a = n % 2;
        while(a < n) {
            a += 2;
            factorial *= a;
        }
        System.out.println(factorial);
    }
}
