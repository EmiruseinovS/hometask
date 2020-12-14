package task13;

public class Main {
    public static void main(String[] args) {
        double R1, R2, S1, S2, S3;
        R1 = 15; R2 = 10;
        S1 = 3.14 * (R1 * R1); S2 = 3.14 * (R2 * R2);
        S3 = S1 - S2;
        System.out.println("Площадь круга S1 равна " + S1);
        System.out.println("Площадь круга S2 равна " + S2);
        System.out.println("Площадь кольца S3 равна " + S3);
    }
}
