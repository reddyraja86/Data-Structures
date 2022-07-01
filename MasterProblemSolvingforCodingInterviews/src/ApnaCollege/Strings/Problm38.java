package ApnaCollege.Strings;

/**
 * Palindromic Substrings
 * Example 1:
 * 
 * Input: s = "abc"
 * Output: 3
 * Explanation: Three palindromic strings: "a", "b", "c".
 * Example 2:
 * 
 * Input: s = "aaa"
 * Output: 6
 * Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa"
 */
public class Problm38 {
    public static void main(String[] args) {
        String s = "abc";
        String r = "";
        allCombos(s, r, 0);
    }

    /** Find all substring combinations ths is continuous characters */
    static void findAllSubStringCombos() {

    }

    /** This is find all the combinations */
    static void allCombos(String s, String r, int i) {
        if (i == s.length() && r.length() > 0) {
            System.out.println(r);
            r = r.substring(0, r.length() - 1);
            i = i - 1;
            return;
        }
        if (i < s.length()) {
            allCombos(s, r + s.charAt(i), i + 1);
            allCombos(s, r, i + 1);

        }

    }

}
