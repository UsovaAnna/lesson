package lesson.lesson_12;

/**
 * Created by admin on 12.06.2016.
 */
public class Lesson12_04_StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for (int i = 1; i <= 100; i++) {
            builder.append(i).append(", ");
        }
        builder.delete(builder.length() - 2, builder.length());
        System.out.println(builder.toString());
    }
}
