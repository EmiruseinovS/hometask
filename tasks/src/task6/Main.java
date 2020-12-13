package task6;

public class Main {
    public static void main(String[] args) {
        int a, b, c, V, S;
        a = 5; b = 10; c = 15;
        V = a * b * c;
        S = 2 * (a * b + b * c + a * c);
        System.out.println("Объем фигуры равен " + V + ", а площадь поверхности равна " + S);
    }
}
