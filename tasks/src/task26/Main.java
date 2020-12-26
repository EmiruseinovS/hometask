package task26;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите первую переменную: ");
        int A = task.nextInt();
        System.out.println("Введите вторую переменную: ");
        int B = task.nextInt();
        if(A > B || A < B)
        {
            if (A > B)
                System.out.println("А = В = " + A);
            else if (A < B)
                System.out.println("А = В = " + B);
        }
        else if(A == B)
            System.out.println("A = B = " + 0);

    }
}
