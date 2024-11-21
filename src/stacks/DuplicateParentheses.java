package stacks;

import java.util.Stack;

public class DuplicateParentheses {

    public static void main(String[] args) {
        String str1 = "((a+b))";
        String str2 = "((a)-(b))";
        System.out.println(check(str1));
        System.out.println(check(str2));
    }

    public static boolean check(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == ')') {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }
                if (count < 1) {
                    return true;
                } else {
                    s.pop();
                }

            } else {
                s.push(ch);
            }
        }
        return false;
    }

}
