package lesson.lesson_09;

/**
 * Created by admin on 17.05.2016.
 */
public class Lesson9_02_ProgrammParams {
    /**
     * Откройте конфигурацию программы, в поле Programm arguments введите параметры,
     * сохраните конфигурацию, запустите программу
     * @param args
     */
    public static void main(String[] args) {
        System.out.printf("В программу передано %d аргументов%n", args.length);
        System.out.println("Переданные параметры: ");
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
