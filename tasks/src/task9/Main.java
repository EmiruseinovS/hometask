package task9;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        double a, b, root;
        System.out.println("Введите первую переменную: ");
        a = num.nextInt();
        System.out.println("Введите вторую переменную: ");
        b = num.nextInt();
        root = Math.sqrt(a * b);
        System.out.println("Корень чисел " + a + " и " + b + " равен " + root);

    }
}
