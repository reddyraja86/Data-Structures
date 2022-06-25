package ApnaCollege.Strings;

/**
 * Longest Common Prefix
 * Write a function to find the longest common prefix string amongst an array of
 * strings.
 * If there is no common prefix, return an empty string "".
 * Example 1:
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 * Example 2:
 * 
 * Input: strs = ["dog","racecar","car"]
 * Output: ""
 * Explanation: There is no common prefix among the input strings.
 * 
 */
public class Problem31 {
    public static void main(String[] args) {
        String[] strs = { "ab", "a" };
        System.out.println(longestCommonPrefix(strs));
    }

    static String longestCommonPrefix(String[] strs) {
        if (strs.length == 1)
            return strs[0];

        String result = "";
        if (strs.length > 1) {
            String first = strs[0];
            for (int i = 0; i < first.length(); i++) {
                char ch = first.charAt(i);
                for (int j = 1; j < strs.length; j++) {
                    if (i > strs[j].length() - 1) {
                        return result;
                    } else if (ch != (strs[j].charAt(i))) {
                        return result;
                    }
                }
                result = result + ch;
            }
        }

        return result;
    }
}
