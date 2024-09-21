package strings;

public class SubString {

    public static void main(String[] args){

        String name = "Ankur Bansal";

        subString(name,0,3);

        System.out.println();

        // InBuild Substring function
        System.out.println("This is printed using Inbuilt Sub String function ");
        System.out.print(name.substring(0,3));

    }

    public static void subString(String str, int a, int b){

        for(int i = a; i < b; i++){
            System.out.print(str.charAt(i)+" ");
        }
    }
}
