package lesson.lesson_08;

import java.util.Locale;
import java.util.Scanner;

/**
 * Created by admin on 17.05.2016.
 */
public class Lesson8_01_CharactersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Введите строку, пожалуйста");
        String enteredLine = scanner.nextLine();

        int letterAmount = 0;
        int digitAmount = 0;
        int spaceAmount = 0;
        int otherSignAmount = 0;

        for (int i = 0; i < enteredLine.length(); i++) {
            char sign = enteredLine.charAt(i);
            if (Character.isLetter(sign)) {
                letterAmount++;
            } else if (Character.isDigit(sign)) {
                digitAmount++;
            } else if (Character.isSpaceChar(sign)) {
                spaceAmount++;
            } else {
                otherSignAmount++;
            }
        }

        System.out.printf("Исходная строка: %s,%n" +
                        "количество букв %d,%n" +
                        "количество цифр %d,%n" +
                        "количество пробельных символов %d,%n" +
                        "количество других символов %d%n",
                enteredLine, letterAmount, digitAmount, spaceAmount, otherSignAmount);
    }
}
