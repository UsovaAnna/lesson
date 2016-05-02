package lesson.lesson_06;

/**
 * Created by admin on 02.05.2016.
 */
public class Lecture6_05_OrderCostWithDiscount {
    public static int PRODUCT_1_PRICE = 100 * 100;
    public static int PRODUCT_2_PRICE = 120 * 100;

    public static double DISCOUNT_FOR_COUNT = 0.05;
    public static double DISCOUNT_FOR_SUM = 0.005;

    public static int COUNT_FOR_DISCOUNT = 10;
    public static int SUM_FOR_DISCOUNT = 1000 * 100;

    public static void main(String[] args) {
        int countProduct1 = 9;
        int countProduct2 = 1;

        int cost = calcTotalCost(countProduct1, countProduct2);

        System.out.println("Количество первого товара: " + countProduct1);
        System.out.println("Количество второго товара: " + countProduct2);
        System.out.println("Итоговая стоимость: " + cost);
    }

    private static int calcTotalCost(int countProduct1, int countProduct2) {
        int totalCount = countProduct1 + countProduct2;
        int totalSum = countProduct1 * PRODUCT_1_PRICE + countProduct2 * PRODUCT_2_PRICE;
        if (totalCount > COUNT_FOR_DISCOUNT && totalSum > SUM_FOR_DISCOUNT) {
            return (int) (totalSum * (1 - DISCOUNT_FOR_COUNT - DISCOUNT_FOR_SUM));
        } else if (totalCount > COUNT_FOR_DISCOUNT) {
            return (int) (totalSum * (1 - DISCOUNT_FOR_COUNT));
        } else if (totalSum > SUM_FOR_DISCOUNT) {
            return (int) (totalSum * (1 - DISCOUNT_FOR_SUM));
        } else {
            return totalSum;
        }
    }
}
