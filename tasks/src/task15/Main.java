package task15;

public class Main {
    public static void main(String[] args) {
        double D, L, S, R, Pi;
        Pi = 3.14;
        S = 100;
        R = Math.sqrt(S)/(Pi*Pi);
        L = 2 * Pi * R;
        D = R * 2;
        System.out.println("Радиус окружности равен " + R);
        System.out.println("Площадь окружности равна " + S);
        System.out.println("Длина окружности равна " + L);
        System.out.println("Диаметр окружности равен " + D);
    }
}