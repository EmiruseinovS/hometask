package task24;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A, B;
        Scanner task = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = task.nextInt();
        System.out.println("Введите второе число: ");
        int num2 = task.nextInt();
        if(num1 > num2)
            System.out.println("А равно " + num2 + ", В равно " + num1);
        else if(num1 < num2)
            System.out.println("А равно " + num1 + ", В равно " + num2);
        else
            System.out.println("Числа равны");
    }
}
