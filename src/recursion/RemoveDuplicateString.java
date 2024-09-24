package recursion;

public class RemoveDuplicateString {

    public static void main(String[] args) {

        String str = "ankurbansal";
        uniqueString(str, 0, new boolean[26], new StringBuilder());


    }

    public static void uniqueString(String str, int i, boolean[] map, StringBuilder sb) {

        if (i == str.length()) {

            System.out.println(sb);
            return;

        }

        char currentChar = str.charAt(i);
        if (map[currentChar - 'a']) {
            uniqueString(str, i + 1, map, sb);
        } else {
            map[currentChar - 'a'] = true;
            uniqueString(str, i + 1, map, sb.append(currentChar));
        }

    }

}
