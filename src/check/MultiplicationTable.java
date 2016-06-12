package check;

/**
 * Created by qube on 02.06.2016.
 */
public class MultiplicationTable {
    public static void main(String[] args) {

        for (int i = 1; i <= 12; i++) {
            for (int j = 1; j <= 12; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println("\n");
        }
    }
}




