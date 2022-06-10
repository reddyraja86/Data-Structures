package SlidingWindow;

import java.util.HashSet;
import java.util.Set;

/**
 * Longest Substring Without Repeating Characters
 * Medium
 * 
 * 24803
 * 
 * 1085
 * 
 * Add to List
 * 
 * Share
 * Given a string s, find the length of the longest substring without repeating
 * characters.
 * 
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
 * Example 3:
 * 
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a
 * substring.
 * 
 * 
 */
public class LongetsUniqueSubstring {
    public static void main(String[] args) {

        String[] s = { "p", "r", "a", "t", "e", "e", "k", "b", "h", "a", "i", "y", "a" };
        approachOne(s);
    }

    static void approachOne(String[] s) {

        int i = 0, j = 0, finalLength = 0, localLength = 0;
        String ls = "";

        Set<String> set = new HashSet<String>();

        while (j < s.length) {

            while (j < s.length && !set.contains(s[j])) {
                set.add(s[j] + "");
                ls = ls + s[j];
                j++;
                localLength++;
            }
            if (localLength > finalLength) {
                finalLength = localLength;
                System.out.println(ls);
            }
            if (i < j) {
                ls = ls.substring(1);
                set.remove(s[i] + "");
                i++;
                localLength--;
            }

        }

    }
}
