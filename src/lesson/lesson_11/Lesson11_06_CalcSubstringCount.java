package lesson.lesson_11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by admin on 12.06.2016.
 */
public class Lesson11_06_CalcSubstringCount {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(
                new FileInputStream(
                        "src/lesson/lesson_11/lineInput.txt"))) {
            StringBuilder builder = new StringBuilder();
            while (scanner.hasNext()) {
                builder.append(scanner.nextLine()).append(System.lineSeparator());
            }
            String text = builder.toString();
            final String substring = "123";
            int countSubstring = 0;
            int  indexOfSubstring = text.indexOf(substring);
            while (indexOfSubstring != -1) {
                countSubstring++;
                indexOfSubstring = text.indexOf(substring, indexOfSubstring + substring.length());
            }
            System.out.printf("substring: %s, count: %d, text: %s.", substring, countSubstring, text);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
