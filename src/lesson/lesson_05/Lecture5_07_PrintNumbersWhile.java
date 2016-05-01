package lesson.lesson_05;

/**
 * Created by admin on 01.05.2016.
 */
public class Lecture5_07_PrintNumbersWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 100) {
            if (i == 5 || i % 3 == 0 || (i >= 60 && i <= 80)) {
                i++;
                continue;
            }
            System.out.print(i + " ");
            i++;
        }
    }
}
