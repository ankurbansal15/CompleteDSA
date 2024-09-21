package strings;

public class StringInitialisation {

    public static void main(String[] args) {

        char[] arr = { 'a', 'b', 'c', 'd' };

        String str = "abcd";
        String str2 = new String("xyz");

        System.out.println(str);
        System.out.println(str2);

        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }

}
