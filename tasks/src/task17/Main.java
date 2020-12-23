package task17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner segments = new Scanner(System.in);
        System.out.println("Введите координаты точки А: ");
        int A = segments.nextInt();
        System.out.println("Введите координаты точки B: ");
        int B = segments.nextInt();
        System.out.println("Введите координаты точки C: ");
        int C = segments.nextInt();
        if (A > B)
            System.out.println("Отрезок АВ равен " + (A - B));
        else if (A < B)
            System.out.println("Отрезок АВ равен " + (B - A));
        System.out.println();
        if (B > C)
            System.out.println("Отрезок ВС равен " + (B - C));
        else if (B < C)
            System.out.println("Отрезок ВС равен " + (C - B));

    }
}
