package strings;

public class LowerToUpperCase {

    public static void main(String[] args) {

        String ch = "hi, my name is ankur";
        String ch1 = "Hello World";

        System.out.println(upperCase(ch));
        System.out.println(upperCase(ch1));
    }

    public static String upperCase(String str) {
        StringBuilder sb = new StringBuilder();

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {

                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }
}
