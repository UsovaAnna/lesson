package check;

/**
 * Created by Alexander on 02.06.2016.
 */
public class Palindrome {
    public static void main(String[] args) {
        String line = " Аргентина манит 98нjkгра  ";
        int count = 0;
        for (int i = 0; i < line.length(); ++i) {
            char symbol = line.charAt(i);
            if (!Character.isWhitespace(symbol) || !Character.isLetterOrDigit(symbol)) continue;
            if (Character.isWhitespace(symbol)) continue;

            for (int j = line.length() - 1; j >= 0; --j) {
                char symbolOne = line.charAt(j);
                if (!Character.isWhitespace(symbolOne) || !Character.isLetterOrDigit(symbolOne)) continue;
                if (Character.isWhitespace(symbolOne)) continue;
                if (symbol != symbolOne) {
                    ++count;
                }
            }

        }
        if (count == 0) {
            System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
    }
}
