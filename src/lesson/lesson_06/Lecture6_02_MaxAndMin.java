package lesson.lesson_06;

/**
 * Created by admin on 02.05.2016.
 */
public class Lecture6_02_MaxAndMin {
    public static void main(String[] args) {
        System.out.printf("Максимум из %d и %d это %d%n", 5, 7, findMax(5, 7));
        System.out.printf("Минимум из %d и %d это %d%n", 4, 6, findMin(4, 6));
        System.out.printf("Максимум из %d и %d это %d%n", 15, 27, findMax(15, 27));
        System.out.printf("Минимум из %d и %d это %d%n", 44, 65, findMin(44, 65));
    }

    public static int findMax(int x, int y) {
        return x > y ? x : y;
    }

    public static int findMin(int x, int y) {
        if (x > y) {
            return y;
        } else {
            return x;
        }
    }
}
