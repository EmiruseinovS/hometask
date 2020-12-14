package task12;

public class Main {
    public static void main(String[] args) {
        double a, b, c, P;
        a = 30; b = 20;
        c = Math.sqrt((a * a) + (b * b));
        P = a + b + c;
        System.out.println("Гипотенуза прямоугольного треугольника равна " + c);
        System.out.println("Периметр прямоугольного треугольника равен " + P);
    }
}
