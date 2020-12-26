package task27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int x = task.nextInt();
        System.out.println("Введите второе число: ");
        int y = task.nextInt();
        System.out.println("Введите третье число: ");
        int z = task.nextInt();
        if (x <= y && x <= z)
            System.out.println("Самая маленькая переменная: " + x);
        else if (y <= z && y <= x)
            System.out.println("Самая маленькая переменная: " + y);
        else
            System.out.println("Самая маленькая переменная: " + z);
        if(x == y && y == z && z == x)
            System.out.println("Переменные равны");
    }
}
