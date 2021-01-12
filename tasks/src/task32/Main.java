package task32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("Введите число А: ");
        int A = task.nextInt();
        System.out.println("Введите число В: ");
        int B = task.nextInt();
        if(A>B)
            for(int i = B + 1;i < A;i++)
                System.out.println(i);
        else if(A<B)
            for(int i = A + 1;i < B;i++)
                System.out.println(i);
    }
}
