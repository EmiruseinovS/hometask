package task20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите координаты x1: ");
        double x1 = task.nextDouble();
        System.out.println("Введите координаты y1: ");
        double y1 = task.nextDouble();
        System.out.println("Введите координаты x2: ");
        double x2 = task.nextDouble();
        System.out.println("Введите координаты y2: ");
        double y2 = task.nextDouble();
        double distance;
            distance = Math.sqrt(((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2)));
        System.out.println("Дистанция между клетками: "distance);
    }
}
