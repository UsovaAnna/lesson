package lesson.lesson_05;

/**
 * Created by admin on 01.05.2016.
 */
public class Lecture5_05_PrintNumbersBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i >= 30) {
                break;
            }
            System.out.print(i + " ");
        }
    }
}
