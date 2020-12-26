package task23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = task.nextInt();
        System.out.println("Введите второе число: ");
        int b = task.nextInt();
        if(a > b)
            System.out.println("Число " + a + " больше, число " + b + " меньше");
        else if(a < b)
            System.out.println("Число " + b + " больше, число " + a + " меньше");
        else if(a == b)
            System.out.println("Числа равны");
    }
}