package check;

/**
 * Created by Alexander on 02.06.2016.
 */
public class UpperCaseArray {
    public static String[] upperCase(String[] arrayLine) {
        for (int i = 0; i < arrayLine.length; ++i) {
            arrayLine[i] = arrayLine[i].toUpperCase();
        }
        return arrayLine;
    }

    public static void main(String[] args) {
        String[] arrayLine = {"Hello", "String", "args", "sleep"};
        System.out.println("Массив = ");
        for (String e : upperCase(arrayLine)) {
            System.out.println(e);
        }
    }
}
