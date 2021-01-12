package task35;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите цену: ");
        double price = task.nextDouble();
        for (double weight = 0.1; weight <= 1; weight+=0.1)
            System.out.println(weight + " килограмм конфет стоит " + (price * weight));
    }
}
