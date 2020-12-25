package task21;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите первую переменную: ");
        int num1 = task.nextInt();
        System.out.println("Введите вторую переменную: ");
        int num2 = task.nextInt();
        if(num1 > num2)
            System.out.println("Переменная " + num1 + " больше");
        else if(num1 < num2)
            System.out.println("Переменая " + num2 + " больше");
        else
            System.out.println("Переменные равны ");
    }
}
