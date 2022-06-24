package ApnaCollege.Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Problem28 {
    public static void main(String[] args) {
        String s = "ac";
        String t = "bb";
        boolean result = isAnagramSort(s, t);
        System.out.println(result);
    }

    static boolean isAnagramSort(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        char[] a = s.toCharArray();
        char[] b = t.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        int i = 0;
        while (i < a.length) {
            if (a[i] != b[i]) {
                return false;
            }
            i++;
        }

        return true;

    }

    /**
     * Using Additional memory
     * time :O(n)
     * space : O(n)
     */
    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        Map<Character, Integer> m = new HashMap<Character, Integer>();

        for (int i = 0; i < s.length(); i++) {
            if (m.containsKey(s.charAt(i))) {
                int c = m.get(s.charAt(i));
                c++;
                m.put(s.charAt(i), c);
            } else {
                m.put(s.charAt(i), 1);
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (m.containsKey(ch)) {
                int val = m.get(ch);
                if (val == 0) {
                    return false;
                } else {
                    val = val - 1;
                    m.put(ch, val);
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /**
     * Wrong answer for input String s = "ac";
     * String t = "bb";
     */
    static boolean isAnagramOne(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        int stotal = 0;
        for (int i = 0; i < s.length(); i++) {
            stotal = stotal + (int) s.charAt(i);
        }
        int ttotal = 0;
        for (int i = 0; i < t.length(); i++) {
            ttotal = ttotal + (int) t.charAt(i);
        }

        if (stotal == ttotal) {
            return true;
        }

        return false;

    }
}
