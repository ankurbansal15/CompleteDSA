package strings;

public class PrintSingleElement {

    public static void main(String[] args) {

        String str = "Ankur";

        System.out.println(str.charAt(0));
        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

}
