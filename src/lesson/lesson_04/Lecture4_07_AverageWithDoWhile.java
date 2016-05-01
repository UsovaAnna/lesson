package lesson.lesson_04;

/**
 * Created by admin on 26.04.2016.
 */
public class Lecture4_07_AverageWithDoWhile {
    public static void main(String[] args) {
        int firstNumber = 1; // первое значение в последовательности
        int lastNumber = 100; // последнее значение

        int curNumber = firstNumber;
        int sum = 0;
        int count = 0;

        /*
           считаем сумму чисел в последовательности и их количесво
         */
        do {
            sum += curNumber;
            count++;
            curNumber++;
        } while (curNumber <= lastNumber);

        double average = (double) sum / count; // находим среднее арифметическое
        System.out.println("Среднее арифметическое: " + average);
    }
}
