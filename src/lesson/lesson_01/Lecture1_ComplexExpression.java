package lesson.lesson_01;

/**
 * Created by admin on 23.04.2016.
 */

public class Lecture1_ComplexExpression {
    public static void main(String[] args) {
        int b = 2;
        int c = 8;
        int a = 5 + b / 2 * c + 7 % 4 - b;
        System.out.println("a: " + a);
    }
}
