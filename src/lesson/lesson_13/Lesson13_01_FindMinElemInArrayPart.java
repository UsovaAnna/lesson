package lesson.lesson_13;

import java.util.Arrays;

/**
 * Created by admin on 02.06.2016.
 */
public class Lesson13_01_FindMinElemInArrayPart {
    public static void main(String[] args) {
        int [] array = {-10, 4, 2, 7, 1, 8, 78, -7};

        int start = 3;
        int minElemIndex = findMinElemIndex(start, array);
        System.out.printf("В массиве %s, минимальный элемент %d c индексом %d%n" +
                        "поиск осущевствлялся с %d элемента",
                Arrays.toString(array), array[minElemIndex], minElemIndex, start);
    }

    private static int findMinElemIndex(int start, int[] array) {
        int minElem = array[start];
        int minElemIndex = start;
        for(int i = start; i < array.length; i++){
            if(minElem > array[i]){
                minElem = array[i];
                minElemIndex = i;
            }
        }
        return minElemIndex;
    }
}
