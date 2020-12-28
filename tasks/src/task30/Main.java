package task30;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int A = task.nextInt();
        System.out.println("Введите второе число: ");
        int B = task.nextInt();
        System.out.println("Введите третье число: ");
        int C = task.nextInt();
        if(A >= B && C >= B)
            System.out.println("Сумма двух наибольших чисел равна: " + (A + C));
        else if(B >= A && C >= A)
            System.out.println("Сумма двух наибольших чисел равна: " + (B + C));
        else if(A >= C && B >= C)
            System.out.println("Сумма двух наибольших чисел равна: " + (A + B));

    }
}
