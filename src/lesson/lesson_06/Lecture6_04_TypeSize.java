package lesson.lesson_06;

/**
 * Created by admin on 02.05.2016.
 */
public class Lecture6_04_TypeSize {
    public static void main(String[] args) {
        System.out.println("Размер byte: " + getTypeSize((byte)1));
        System.out.println("Размер short: " + getTypeSize((short)1));
        System.out.println("Размер int: " + getTypeSize(1));
        System.out.println("Размер long: " + getTypeSize(1L));
        System.out.println("Размер float: " + getTypeSize(1.0f));
        System.out.println("Размер double: " + getTypeSize(1.0));
    }

    public static int getTypeSize(byte x){
        return 1;
    }
    public static int getTypeSize(short x){
        return 2;
    }
    public static int getTypeSize(int x){
        return 4;
    }
    public static int getTypeSize(long x){
        return 8;
    }
    public static int getTypeSize(float x){
        return 4;
    }
    public static int getTypeSize(double x){
        return 8;
    }

}
