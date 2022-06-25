package ApnaCollege.Strings;

/**
 * Longest Substring Without Repeating Characters
 * Example 1:
 * 
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 * 
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * 
 */
public class Problem34 {
    public static void main(String[] args) {
        String s = "pwwkew";

        int i = 0, j = 0;

        int length = 0;
        String result = "";
        while (j < s.length()) {

            while (j < s.length() && !result.contains(s.charAt(j) + "")) {
                result = result + s.charAt(j);
                j++;
            }
            if (result.length() > length) {
                length = result.length();
            }
            i++;
            result = s.substring(i, j);

        }
        System.out.println(length);
    }
}
