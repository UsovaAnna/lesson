package lesson.lesson_12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * Created by admin on 12.06.2016.
 */
public class Lesson12_03_ReadAndWrite {
    public static void main(String[] args) {

        try(Scanner scanner = new Scanner(
                new FileInputStream(
                        "src/lesson/lesson_12/lineInput.txt"));
            PrintWriter writer = new PrintWriter("src/lesson/lesson_12/lineOutput.txt")){
          while(scanner.hasNext()){
              String line = scanner.nextLine();
              writer.println(line.toUpperCase());
          }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
