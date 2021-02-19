package task58;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("a: ");
        int a = task.nextInt();
        double k = 0;
        double sum = 0;
        while(sum <= a) {
            ++k;
            sum += 1/k;
        }
        System.out.println(sum + " " + k);
    }
}
