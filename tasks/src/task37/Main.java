package task37;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите переменную А: ");
        int a = task.nextInt();
        System.out.println("Введите переменную В: ");
        int b = task.nextInt();
        int sum = 0;
        for(int i = a;i < b;i++)
        System.out.println("Сумма чисел между А и В равна: " + (sum += i));
    }
}