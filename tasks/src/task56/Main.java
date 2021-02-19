package task56;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("n: ");
        int n = task.nextInt();
        int sum = 0;
        int k = 0;
        while(sum < n) {
            ++k;
            sum += k;
        }
        System.out.println(k + " " + sum);
    }
}
