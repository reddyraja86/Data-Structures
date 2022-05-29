/*
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

 

Example 1:

Input: strs = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
**/

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = { "", "b" };
        System.out.println(longestCommonPrefix(strs));
    }

    static String longestCommonPrefix(String[] strs) {
        int l = strs.length;
        boolean flag = true;
        int j = 0;
        String result = "";
        while (flag) {
            String ch = null;
            for (int i = 0; i < l; i++) {
                if (strs[i].length() > j) {
                    String t = strs[i].charAt(j) + "";
                    if (ch == null) {
                        ch = t;
                    } else if (!ch.equals(t)) {
                        flag = false;
                        return result;
                    }
                } else {
                    flag = false;
                    return result;
                }

            }
            result = result + ch;
            j++;
        }
        System.out.println(result);
        return result;
    }
}
