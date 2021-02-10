package task48;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = task.nextInt();
        System.out.println("Введите k: ");
        int k = task.nextInt();
        int result = 0;
        int remainder = 0;
        int a = k;
        while(k - n <= 0) {
            k += a;
            result++;
            remainder = n - (k - a);
        }
        System.out.println("Частное = " + result);
        System.out.println("Остаток = " + remainder);
        return;
    }
}
