package lesson.lesson_04;

/**
 * Created by admin on 26.04.2016.
 */
public class Lecture4_08_EvenAverage {
    public static void main(String[] args) {
        int firstNumber = 1;
        int lastNumber = 100;

        int curNumber = firstNumber;
        int sum = 0;
        int count = 0;

        while (curNumber <= lastNumber) {
            if (curNumber % 2 == 0) {
                sum += curNumber;
                count++;
            }
            curNumber++;
        }

        double average = (double) sum / count;
        System.out.println("Среднее арифметическое четных чисел: " + average);
    }
}
