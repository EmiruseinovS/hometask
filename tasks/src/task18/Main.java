package task18;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите координаты точки А: ");
        int A = task.nextInt();
        System.out.println("Введите координаты точки B: ");
        int B = task.nextInt();
        System.out.println("Введите координаты точки C: ");
        int C = task.nextInt();
        System.out.println();
        if (C > A && C < B)
            System.out.println("Произведение длин отрезков равно: " + ((Math.abs(C) - Math.abs(A)) * (Math.abs(B) - Math.abs(C))));
        else if (C > A && C < B)
            System.out.println("Значение переменной С не соответствует условию!");
        else if (C > A && C > B)
            System.out.println("Значение переменной С не соответствует условию!");
    }
}
