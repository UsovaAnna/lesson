package check;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by qube on 02.06.2016.
 */

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введите координаты первой точки: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Введите координаты второй точки: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        System.out.println("Введите координаты третьей точки: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        if (isPointsLieOnSameLine(x1, y1, x2, y2, x3, y3)) {
            System.out.println("заданные координаты лежат на одной прямой");
        } else {
            System.out.printf("Площадь треугольника равна: %f", (areaOfTriangle(x1, y1, x2, y2, x3, y3)));
        }
    }

    public static double lengthOfSegment(double x1, double y1, double x2, double y2) {
        return Math.sqrt((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2)));
    }

    public static boolean isPointsLieOnSameLine(double x1, double y1, double x2, double y2, double x3, double y3) {

        double epsilon = 1.0e-10;
        double x = ((x3 - x1) / (x2 - x1)) - ((y3 - y1) / (y2 - y1));
        double y = x2 - x1;
        double z = y2 - y1;

        return Math.abs(y) > epsilon && Math.abs(z) > epsilon && Math.abs(x) <= epsilon;
    }

    public static double areaOfTriangle(double x1, double y1, double x2, double y2, double x3, double y3) {

        double sideA = lengthOfSegment(x1, y1, x2, y2);
        double sideB = lengthOfSegment(x2, y2, x3, y3);
        double sideC = lengthOfSegment(x3, y3, x1, y1);

        double p = (sideA + sideB + sideC) / 2;
        return Math.sqrt(p * (p - sideA) * (p - sideB) * (p - sideC));
    }
}

