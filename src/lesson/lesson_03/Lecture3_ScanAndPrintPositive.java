package lesson.lesson_03;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by admin on 26.04.2016.
 */
public class Lecture3_ScanAndPrintPositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if(number > 0){
            System.out.println("Число " + number + " - положительное");
        }
    }
}
