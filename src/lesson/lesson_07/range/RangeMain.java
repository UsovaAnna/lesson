package lesson.lesson_07.range;

/**
 * Created by admin on 17.05.2016.
 */
public class RangeMain {
    public static void main(String[] args) {
        Range range = new Range(7.2, 45.9);
        System.out.printf("Длина диапозона: %.2f%n", range.calcLength());

        double point = 23.6;
        if(range.isInside(point)) {
            System.out.printf("Точка %.2f находится внутри числового диапозона%n", point);
        }
        else{
            System.out.printf("Точка %.2f находится снаружи числового диапозона%n", point);
        }
    }
}
