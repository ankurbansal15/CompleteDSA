package backtracking;

public class Subsets {

    public static void main(String[] args) {

        String str = "abc";
        String ans = "";

        subsets(str, ans, 0);
    }

    public static void subsets(String str, String ans, int i) {

        if (i == str.length()) {

            if (ans.isEmpty()) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        subsets(str, ans + str.charAt(i), i + 1);
        subsets(str, ans, i + 1);
    }

}
