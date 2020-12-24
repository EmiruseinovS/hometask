package task19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите координаты первой вершины: ");
        System.out.println("х1 равен: ");
        int x1 = task.nextInt();
        System.out.println("у1 равен: ");
        int y1 = task.nextInt();
        int x2 = x1 - x1 - x1;
        System.out.println("х2 равен: " + x2);
        int y2 = y1 - y1 - y1;
        System.out.println("y2 равен: " + y2);
        int a, b, c, d; // a верхняя сторона, с нижняя. в и d боковые
        a = Math.abs(x1) * 2;
        c = a;
        b = y1 * 2;
        d = b;
        System.out.println("Стороны а и с равны: " + a + "; Стороны в и d равны: " + b);
        int P, S;
        P = (a + c) + (b + d);
        S = a * b;
        System.out.println("Периметр прямоугольника равен: " + P + "; Площадь прямоугольника равна: " + S);
    }
}
