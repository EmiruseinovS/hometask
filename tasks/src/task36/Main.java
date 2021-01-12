package task36;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите цену: ");
        double price = task.nextDouble();
        for(double weight = 1; weight <= 2; weight+=0.2)
            System.out.println(weight + " килограмм конфет стоит " + (price * weight));
    }
}
