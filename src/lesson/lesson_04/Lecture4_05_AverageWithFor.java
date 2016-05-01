package lesson.lesson_04;

/**
 * Created by admin on 26.04.2016.
 */
public class Lecture4_05_AverageWithFor {
    public static void main(String[] args) {
        int firstNumber = 1;
        int lastNumber = 100;

        int sum = 0;
        int count = 0;

        for (int i = firstNumber; i <= lastNumber; i++){
            sum += i;
            count++;
        }

        double average = (double) sum / count;
        System.out.println("Среднее арифметическое: " + average);
    }
}
