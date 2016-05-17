package lesson.lesson_09;

/**
 * Created by admin on 17.05.2016.
 */
public class Lesson9_03_FindNumberInArray {

    public static void main(String[] args) {
        int[] array = {4, 6, 7, 8, 9, 67};
        int x = 9;
        int index = findInArray(x, array);
        if (index == -1) {
            System.out.printf("Элемента %d в массиве нет", x);
        } else {
            System.out.printf("Элемент %d находится в массиве, его индекс %d", x, index);
        }
    }

    public static int findInArray(int x, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }
}
