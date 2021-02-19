package task59;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("a: ");
        int a = task.nextInt();
        double sum = 0;
        double k = 1;
        while(a - 1 / k > sum) {
            k++;
            sum += 1/k;
        }
        System.out.println(sum + " " + k);
    }
}
