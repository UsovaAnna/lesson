package lesson.lesson_12;

/**
 * Created by admin on 12.06.2016.
 */
public class Lesson12_07_Sum {
    public static void main(String[] args) {
        final String numbersLine = "1, 2, 3, 5";
        String[] numbersAsStringArray = numbersLine.split(", ");
        int[] numbersArray = new int[numbersAsStringArray.length];
        for (int i = 0; i < numbersArray.length; i++) {
            numbersArray[i] = Integer.parseInt(numbersAsStringArray[i]);
        }
        int sum = 0;
        for (int i = 0; i < numbersArray.length; i++) {
            sum += numbersArray[i];
        }
        System.out.printf("numbersLine: %s, sum: %d", numbersLine, sum);
    }
}
