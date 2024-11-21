package stacks;

import java.util.Stack;


public class ReverseString {

    public static void main(String[] args) {

        String s = "abc";

        String result = reverse(s);
        System.out.println(result);
    }

    public static String reverse(String s) {

        int iterator = 0;

        Stack<Character> list = new Stack<>();
        while (iterator < s.length()) {
            list.push(s.charAt(iterator));
            iterator++;
        }

        StringBuilder sb = new StringBuilder();

        while (!list.isEmpty()) {
            sb.append(list.peek());
            list.pop();
        }

        return sb.toString();

    }

}
