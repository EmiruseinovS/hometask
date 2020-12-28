package task29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        int biggest, smallest;
        System.out.println("Задайте значение переменной А: ");
        int A = task.nextInt();
        System.out.println("Задайте значение переменной В: ");
        int B = task.nextInt();
        System.out.println("Задайте значение переменной С: ");
        int C = task.nextInt();
        if(A < B && A < C)
            System.out.println("Самая маленькая переменная А");
        else if(B < A && B < C)
            System.out.println("Самая маленькая переменная В");
        else if(C < A && C < A)
            System.out.println("Самая маленькая переменная С");
        if(A > B && A > C)
            System.out.println("Самая большая переменная A");
        else if(B > A && B > C)
            System.out.println("Самая большая переменная B");
        else if(C > A && C > B)
            System.out.println("Самая большая переменная C");
    }
}
