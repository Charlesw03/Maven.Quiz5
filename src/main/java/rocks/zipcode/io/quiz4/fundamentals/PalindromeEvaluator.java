package rocks.zipcode.io.quiz4.fundamentals;


import java.util.ArrayList;
import java.util.List;

/**
 * @author leon on 18/12/2018.
 */
public class PalindromeEvaluator {

    public static String[] getAllPalindromes(String string) {
        String[] a = StringEvaluator.getAllSubstrings(string);
        List<String> strList = new ArrayList<>();
        for (String s : a) {
            if (isPalindrome(s)) {
            strList.add(s);
            }
        }
        return strList.toArray(new String[strList.size()]);
    }

    public static Boolean isPalindrome(String string) {
        return string.equals(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();

        return sb.toString();
    }
}
