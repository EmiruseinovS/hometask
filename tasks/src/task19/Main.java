package task19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите первую переменную: ");
        int num1 = task.nextInt();
        System.out.println("Введите вторую переменную: ");
        int num2 = task.nextInt();
        System.out.println("Введите третью переменную: ");
        int num3 = task.nextInt();
        if(num1>= 0 && num2 >= 0 && num3 >=0)
            System.out.println("Количество положительных переменных равно 3");
        else if(num1 >= 0 && num2 >= 0 || num2 >= 0 && num3 >= 0 || num1 >= 0 && num3 >= 0)
            System.out.println("Количество положительных переменных равно 2");
        else if(num1 >= 0 || num2 >= 0 || num3 >= 0)
            System.out.println("Количество положительных переменных равно 1");
    }
}
