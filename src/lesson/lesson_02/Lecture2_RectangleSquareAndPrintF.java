package lesson.lesson_02;

/**
 * Created by admin on 23.04.2016.
 */
public class Lecture2_RectangleSquareAndPrintF {
    public static void main(String[] args) {
        double width = 4.9;
        double height = 6.8;

        double square = width * height;
        double perimeter = 2 * (width + height);

        System.out.printf("Длина прямоугольника: %f %n" +
                "Ширина прямоугольника: %f %n" +
                "Площадь прямоугольника: %f %n" +
                "Периметор прямоугольника: %f", width, height, square, perimeter);
    }
}