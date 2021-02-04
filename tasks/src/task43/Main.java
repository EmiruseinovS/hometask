package task43;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите n: ");
        int n = task.nextInt();
        double res = 0;
        for  (int i =1; i<=n; i++)
            res += Math.pow(-1,i+1)*(1.0+(double)i/10);
        System.out.println(res);
    }
}
