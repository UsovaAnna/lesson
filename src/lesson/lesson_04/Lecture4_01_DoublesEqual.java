package lesson.lesson_04;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by admin on 26.04.2016.
 */
public class Lecture4_01_DoublesEqual {
    public static void main(String[] args) {
        double epsilon = 0.00001;
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Эта программа сравнивает два вещественных числа с учетом погрешности.");
        System.out.print("Введите первое число: ");
        double firstNumber = scanner.nextDouble();
        System.out.print("Введите второе число: ");
        double secondNumber = scanner.nextDouble();
        // сравнение вещественных чисел
        if (Math.abs(firstNumber - secondNumber) < epsilon) {
            System.out.println("Числа " + firstNumber + ", " + secondNumber + " равны.");
        } else {
            System.out.println("Числа " + firstNumber + ", " + secondNumber + " не равны.");
        }
    }
}
