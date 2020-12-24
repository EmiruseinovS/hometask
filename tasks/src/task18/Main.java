package task18;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите переменную: ");
        int number = task.nextInt();
        if(number > 0)
            number = number + 1;
        else if(number < 0)
            number = number - 2;
        else if(number == 0)
            number = 10;
        System.out.println("Переменная равна: " + number);
    }
}
