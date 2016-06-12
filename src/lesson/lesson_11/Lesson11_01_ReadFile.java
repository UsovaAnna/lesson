package lesson.lesson_11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson11_01_ReadFile {
    public static void main(String[] args) {
        /**
         * создайте текстовый файл, рядом с этим файлом
         * заполните его строками. Конец строки - перевод строки.
         */
        try (Scanner scanner = new Scanner(
                new FileInputStream(
                        "src/lesson/lesson_11/lineInput.txt"))) {
            String[] lineArray = new String[5];
            for(int i = 0; scanner.hasNext(); i++){
                lineArray[i] = scanner.nextLine();
            }
            for(int i = 0; i < lineArray.length; i++){
                System.out.println(lineArray[i]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
