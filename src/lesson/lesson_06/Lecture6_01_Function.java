package lesson.lesson_06;

/**
 * Created by admin on 02.05.2016.
 */
public class Lecture6_01_Function {
    public static void main(String[] args) {
        System.out.println(calc3XPlus4Y(5, 7));
        System.out.println(calc3XPlus4Y(2.7, 1.5));
        System.out.println(calc3XPlus4Y(-9.5, 4.7));
    }

    public static double calc3XPlus4Y(double x, double y) {
        return 3 * x + 4 * y;
    }
}
