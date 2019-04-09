package rocks.zipcode.io.quiz4.fundamentals;

import rocks.zipcode.io.quiz4.objectorientation.PalindromeObject;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class StringEvaluator {
    public static String[] getAllSubstrings(String string) {
        Set<String> sizzet = new HashSet<>();

        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                String sub = string.substring(i, j);
                sizzet.add(sub);
            }
        }
        String[] allSubs = new String[sizzet.size()];


        return sizzet.toArray(allSubs);
    }

    public static String[] getCommonSubstrings(String string1, String string2) {
        List<String> commons = new ArrayList<>();
        List<String> subs1 = new ArrayList<>();

        String[] str1 = getAllSubstrings(string1);
        subs1.addAll(Arrays.asList(str1));
        String[] str2 = getAllSubstrings(string2);


        for (String s : str2) {
            if (subs1.contains(s)) {
                commons.add(s);
            }
        }
        String[] a = commons.toArray(new String[commons.size()]);

        return a;
    }

    public static String getLargestCommonSubstring(String string1, String string2) {

        String[] a = getCommonSubstrings(string1, string2);
        String temp = a[0];
        for (String s : a) {
            if (s.length() > temp.length()) {
                temp = s;
            }
        }


        return temp;

    }
}
