package lesson.lesson_12;

/**
 * Created by admin on 02.06.2016.
 */
public class Lesson12_01_Pow {
    public static void main(String[] args) {
        System.out.printf("%d^%d = %d%n", 2, 4, pow(2, 4));
        System.out.printf("%d^%d = %d%n", 5, 3, powRecursive(5, 3));
    }

    public static int pow(int a, int b){
        int product = 1;
        for(int i = 0; i < b; i++){
           product = product * a;
        }
        return product;
    }

    public static int powRecursive(int a, int b){
        if(b == 0){
            return 1;
        } else {
            return a * powRecursive(a, b - 1);
        }
    }
}
