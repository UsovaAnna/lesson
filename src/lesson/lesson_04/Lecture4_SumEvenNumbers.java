package lesson.lesson_04;

/**
 * Created by admin on 26.04.2016.
 */
public class Lecture4_SumEvenNumbers {
    public static void main(String[] args) {
        int firstNumber = 3;
        int lastNumber = 21;

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
        System.out.println("Сумма четных чисел от " + firstNumber +
                " до " + lastNumber + " равна " + sum);
        System.out.println("Количество четных чисел: " + count);
    }
}
