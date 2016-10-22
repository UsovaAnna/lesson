package lesson.lesson_09;

/**
 * Created by Anna on 22.10.2016.
 */
public class Lesson_9_04_findNumberInArray {
    public static void main(String[] args) {
        double[] arrayDouble = {2.4, 4.9, 5, 67, 1.0, 2.7};
        int[] arrayInt = {1, 4, 5, 7, 3, 3, 6};

        double max = findMax(arrayDouble);
        System.out.println("max number: " + max);

        double number = 2.7;
        int index = findNumberIndex(arrayDouble, number);
        printNumberAndIndex(number, index);

        number = 27;
        index = findNumberIndex(arrayDouble, number);
        printNumberAndIndex(number, index);


        double average = calcAverageOfEvenNumbers(arrayInt);
        System.out.println("average of even numbers: " + average);

        System.out.println("");
    }

    private static void printNumberAndIndex(double number, int index) {
        if (index == -1) {
            System.out.printf("Elem %f is not in array%n", number);
        } else {
            System.out.printf("elem %f has index %d%n", number, index);
        }
    }

    public static double findMax(double[] array) {
        double record = array[0];
        for (int i = 0; i < array.length; i++) {
            if (record < array[i]) {
                record = array[i];
            }
        }
        return record;
    }

    public static int findNumberIndex(double[] array, double number) {
        for (int i = 0; i < array.length; i++) {
            if (isDoublesEqual(number, array[i])) {
                return i;
            }
        }
        return -1;
    }

    public static double calcAverageOfEvenNumbers(int[] array) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
                count++;
            }
        }
        return (double) sum / count;
    }

    public static boolean isDoublesEqual(double a, double b) {
        return Math.abs(a - b) < 0.0001;
    }
}
