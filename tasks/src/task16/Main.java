package task16;
import com.sun.security.jgss.GSSUtil;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner distance = new Scanner(System.in);
        System.out.println("Введите координаты первой точки: ");
        int x1 = distance.nextInt();
        System.out.println("Введите координаты второй точки: ");
        int x2 = distance.nextInt();
        if (x1 > x2)
            System.out.println("Расстояние между точками составляет " + (x1 - x2));
        else if (x1 < x2)
            System.out.println("Расстояние между точками составляет " + (x2 - x1));
    }
}
