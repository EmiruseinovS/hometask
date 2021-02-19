package task61;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner task = new Scanner(System.in);
        System.out.println("n: ");
        int n = task.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = 1 + i * 2;
            System.out.println("array[" + i + "]=" + array[i]);
        }
    }
}
//
// Дано целое число N (> 0). Сформировать и вывести целочисленный
//        массив размера N, содержащий N первых положительных нечетных чисел:
//        1, 3, 5, . . . .