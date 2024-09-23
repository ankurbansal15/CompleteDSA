package bit_manipulation;

public class SwapUsingBits {

    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        swap(a, b);

    }

    public static void swap(int a, int b) {

        System.out.println("Values Before Swap : a = " + a + " b = " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("Values After Swap : a = " + a + " b = " + b);
    }


}
