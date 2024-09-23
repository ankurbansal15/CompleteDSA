package bit_manipulation;

public class ClearRangeOfBits {

    public static void main(String[] args) {

        System.out.println(clearBitsInRangeOf(10, 4, 2));
    }

    public static int clearBitsInRangeOf(int n, int j, int i) {
        int a = (~0) << j + 1;
        int b = (1 << i) - 1;

        int bitmask = a | b;

        return n & bitmask;
    }
}
