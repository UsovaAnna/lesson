package lesson.lesson_11;

/**
 * Created by admin on 12.06.2016.
 */
public class Lesson11_05_Url {
    public static void main(String[] args) {
        final String url = "http://SomeServerName/abcd/";
        final String prefix = "://";
        final String postfix = "/";
        int prefixIndex = url.indexOf(prefix);
        int endPrefixEndex = prefixIndex + prefix.length();
        int postfixIndex = url.indexOf(postfix, endPrefixEndex);
        if(postfixIndex == -1){
            postfixIndex = url.length();
        }
        String serverName = url.substring(endPrefixEndex, postfixIndex);
        System.out.printf("Url: %s. ServerName: %s", url, serverName);
    }
}
