package lesson.lesson_02;

/**
 * Created by admin on 23.04.2016.
 */
public class Lecture2_CircleSquareWithComments {
    public static void main(String[] args) {
        double radius = 7.8; // радиус окружности

        /*S = Pi * radius^2*/
        double square = Math.PI * Math.pow(radius, 2);

        System.out.println("Radius: " + radius + ", square: " + square); // печать в консоль
    }
}
