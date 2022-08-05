package ApnaCollege.Strings;

/**
 * Smallest window in a string containing all the characters of another string
 * Input:
 * S = "timetopractice"
 * P = "toc"
 * Output:
 * toprac
 * Explanation: "toprac" is the smallest
 * substring in which "toc" can be found.
 * 
 */
public class Problem41 {
    public static void main(String[] args) {
        String s = "timetopractice";
        String p = "toc";
        smallestWindow(s, p);
    }

    static String smallestWindow(String s, String p) {
        int i = 0, j = 0;
        int c = 0;
        Character ch = null;
        int prev = 0;

        while (i < s.length() && j < s.length()) {
            while (j < s.length() && c != p.length()) {
                ch = p.charAt(c);
                if (ch == s.charAt(j)) {
                    c++;
                }
                j++;
            }
            if (c == p.length()) {
                System.out.println(j - i);

                if (s.charAt(i) == p.charAt(prev)) {
                    prev++;
                    c--;
                }
                i++;
            }
        }

        return "";
    }
}
