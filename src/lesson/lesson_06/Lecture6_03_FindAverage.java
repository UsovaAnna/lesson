package lesson.lesson_06;

/**
 * Created by admin on 02.05.2016.
 */
public class Lecture6_03_FindAverage {
    public static void main(String[] args) {
        int begin = 2;
        int end = 8;

        double average = calcAverage(begin, end);
        System.out.printf("Среднееарифметическое от %d до %d это %f%n", begin, end, average);
    }

    private static double calcAverage(int begin, int end) {
        int sum = 0;
        for(int i = begin; i <= end; i++){
            sum += i;
        }
        return (double) sum / (end - begin + 1);
    }
}
