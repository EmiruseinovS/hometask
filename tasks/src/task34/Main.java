package task34;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите цену: ");
        int price = task.nextInt();
        for (int weight = 1; weight <= 10; weight++)
            System.out.println(weight + " килограмм конфет стоит " + (price * weight));
    }
}
