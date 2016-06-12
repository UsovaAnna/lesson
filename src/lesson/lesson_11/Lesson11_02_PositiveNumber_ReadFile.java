package lesson.lesson_11;

import java.io.FileInputStream;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by admin on 26.04.2016.
 */
public class Lesson11_02_PositiveNumber_ReadFile {
    public static void main(String[] args) {
        /**
         * создайте текстовый файл, рядом с этим файлом
         * заполните его числами. Разделители между числами: проблел, перевод строки и тд.
         */
        try(Scanner scanner = new Scanner(
                new FileInputStream(
                        "src/lesson/lesson_11/numberInput.txt"))) {
            scanner.useLocale(Locale.US);

            System.out.print("Введите число: ");
            int number = scanner.nextInt();

            if (number > 0) {
                System.out.println("Число " + number + " - положительное");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
