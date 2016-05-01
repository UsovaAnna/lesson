package lesson.lesson_04;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by admin on 26.04.2016.
 */
public class Lecture4_Commands {
    public static void main(String[] args) {
        final String PRINT_COMMAND = "print";
        final String SUM_COMMAND = "sum";

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.println("Эта программа выполняет команды. Доступные команды: print, sum.");
        System.out.print("Введите команду: ");
        String command = scanner.nextLine();

        switch (command) {
            case PRINT_COMMAND:
                System.out.print("Введите строку: ");
                String line = scanner.nextLine();
                System.out.println("Введенная строка: " + line);
                break;
            case SUM_COMMAND:
                System.out.print("Введите первое число: ");
                double firstNumber = scanner.nextDouble();
                System.out.print("Введите второе число: ");
                double secondNumber = scanner.nextDouble();
                double sum = firstNumber + secondNumber;
                System.out.println(firstNumber + " + " + secondNumber + " = " + sum);
                break;
            default:
                System.out.println("Вы ввели неизвестную команду: " + command);
        }
    }
}
