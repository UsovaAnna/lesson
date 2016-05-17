package lesson.lesson_09;

/**
 * Created by admin on 17.05.2016.
 */
public class Lesson9_01_array100 {
    public static void main(String[] args) {
        int[] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}
