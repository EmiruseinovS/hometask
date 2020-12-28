package task28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Задайте значение переменной А: ");
        int A = task.nextInt();
        System.out.println("Задайте значение переменной B: ");
        int B = task.nextInt();
        System.out.println("Задайте значение переменной C: ");
        int C = task.nextInt();
        if(A < B && A > C || A > B && A < C)
            System.out.println("Среднее число A");
        else if(B < A && B > C || B > A && B < C)
            System.out.println("Среднее число B");
        else if(C < A && C > A || C > A && C < A)
            System.out.println("Среднее число C");
    }
}
