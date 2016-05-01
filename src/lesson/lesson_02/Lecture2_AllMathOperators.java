package lesson.lesson_02;

/**
 * Created by admin on 23.04.2016.
 */
public class Lecture2_AllMathOperators {
    public static void main(String[] args) {
        int a;
        double d;

        int b = 3;
        int c = 4;

        a = b + c; // сложение
        System.out.println("a = b + c; a = " + a);
        a = b - c; // вычитание
        System.out.println("a = b - c; a = " + a);
        a = b * c; // умножение
        System.out.println("a = b * c; a = " + a);
        a = b / c; // целочисленное деление, взятие частного
        System.out.println("a = b / c; a = " + a);
        d = (double) b / c; // вещественное деление, взятие частного
        System.out.println("d = (double) b / c; d = " + d);
        a = b % c; // деление, взятие остатка от деления
        System.out.println("a = b % c; a = " + a);
        a = b * (c + 2); // повышение приоритета операции с помощью оператора ()
        System.out.println("a = b * (c + 2); a = " + a);

    }
}
