package task22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = task.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = task.nextInt();
        if(num1 > num2)
            System.out.println("Порядковый номер наименьшего числа 2");
        else if(num1 < num2)
            System.out.println("Порядковый номер наименьшего числа 1");
        else if(num1 == num2)
            System.out.println("Числа равны");
    }
}

