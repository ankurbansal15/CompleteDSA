package strings;

public class StringPalindrome {

    public static void main(String[] args) {

        String str = "aaabbbccc";
        String str2 = "cccddccceieke";

        String str3 = "Ankur";
        System.out.println(stringPalindrome(str));
        System.out.println(stringPalindrome(str2));
        System.out.println(stringPalindrome(str3));

    }

    public static boolean stringPalindrome(String a) {

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != a.charAt(a.length() - i - 1)) {

                System.out.println("It is a  Not Palindrome");
                return false;

            }

        }
        return true;

    }

}
