package ApnaCollege.Strings;

import java.util.Stack;

public class Problem29 {
    public static void main(String[] args) {

        String s = "()";
        System.out.println(isValid(s));
    }

    static boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char r = stack.pop();
                if (ch == ')' && r != '(') {
                    return false;
                } else if (ch == ']' && r != '[') {
                    return false;
                } else if (ch == '}' && r != '{') {
                    return false;
                }
            }

        }
        if (stack.size() != 0) {
            return false;
        }
        return true;
    }
}
