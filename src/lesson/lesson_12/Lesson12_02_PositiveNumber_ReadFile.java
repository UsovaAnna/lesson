package lesson.lesson_12;

import java.io.FileInputStream;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by admin on 26.04.2016.
 */
public class Lesson12_02_PositiveNumber_ReadFile {
    public static void main(String[] args) {
        /**
         *  создайте текстовый файл в директории проекта.
         *  заполните его числами. Разделители между числами: проблел, перевод строки и тд.
         */
        try (Scanner scanner = new Scanner(
                new FileInputStream("numberInput.txt"))) {
            scanner.useLocale(Locale.US);

            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println("Число " + number + " - положительное");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
