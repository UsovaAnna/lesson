package lesson.lesson_04;

/**
 * Created by admin on 26.04.2016.
 */
public class Lecture4_03_SumNumbers {
    public static void main(String[] args) {
        int firstNumber = 0;
        int lastNumber = 9;

       /* int firstNumber = 3;
        int lastNumber = 21;*/

        int curNumber = firstNumber;
        int sum = 0;
        while (curNumber <= lastNumber) {
            sum += curNumber;
            curNumber++;
        }
        System.out.println("Сумма чисел от " + firstNumber +
                " до " + lastNumber + " равна " + sum);
    }
}
