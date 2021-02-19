package task60;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("p: ");
        double p = task.nextInt();
        int k = 1;
        double s = 10;
        double d = 10;
        double x = d;
        while(s < 200) {
            ++k;
            d = d * (1 + p / 100);
            s += d;
        }
        System.out.println(k + " " + s + " " + d);
    }
}
