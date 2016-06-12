package check;

import java.util.Scanner;

/**
 * Created by qube on 03.06.2016.
 **/
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n = scanner.nextInt();
        System.out.println(getFibonacciNumber(n));
    }

    public static int getFibonacciNumber(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        int n1 = 1;
        int n2 = 0;
        for (int i = 1; i <= n; i++) {
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
        return n2;
    }
}
