package lesson.lesson_05;

/**
 * Created by admin on 01.05.2016.
 */
public class Lecture5_06_PrintNumbersContinue {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i == 5) {
                continue;
            }
            if (i % 3 == 0) {
                continue;
            }
            if (i >= 60 && i <= 80) {
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
