package lesson.lesson_11;

/**
 * Created by Anna on 12.04.2017.
 */
public class Lesson11_01_SelectionSort {
    public static double findIndexOfMinElem(double[] array, int start) {
        double min = array[start];
        int indexOfMinElem = start;
        for (int i = start; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
                indexOfMinElem = i;
            }
        }
        return indexOfMinElem;
    }
}
