package lesson.lesson_12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lesson12_01_ReadFile {
    public static void main(String[] args) {
        /**
         * �������� ��������� ����, ����� � ���� ������
         * ��������� ��� ��������. ����� ������ - ������� ������.
         */
        try (Scanner scanner = new Scanner(
                new FileInputStream(
                        "src/lesson/lesson_12/lineInput.txt"))) {
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
