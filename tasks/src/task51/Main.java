package task51;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите N: ");
        int n = task.nextInt();
        int a = 1;
        int b = a;
        int factorial;
        while(a < n) {
            b = b * a;
            ++a;
            factorial = b * a;
            System.out.println(factorial);
        }
    }
}
