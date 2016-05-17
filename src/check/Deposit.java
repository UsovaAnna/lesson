package check;


import java.util.Locale;
import java.util.Scanner;

public class Deposit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        System.out.print("Введите сумму вклада = ");
        double deposit = scanner.nextDouble();
        System.out.print("Введите ставку депозита = ");
        double rate = scanner.nextDouble();
        System.out.print("Введите кол-во месяцев, на которое вносится депозит = ");
        double month = scanner.nextDouble();

        double rateMonth = rate * month;
        double depositBalance = rateMonth + deposit;
        System.out.println("Сумма вклада за " + month + " месяцев " + depositBalance);

        double balanceMonth = rate / 12;
        double balanceDepositMonth = deposit * balanceMonth / 100;
        double balanceYear = balanceDepositMonth * month;
        double balance = deposit + (balanceDepositMonth * rate);
        System.out.println("Итого " + balance);
        System.out.println("Прибыль " + balanceYear);
    }
}
