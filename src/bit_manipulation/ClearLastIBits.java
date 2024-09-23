package bit_manipulation;

public class ClearLastIBits {

    public static void main(String[] args) {

        System.out.println(clearLastIBits(15, 2));

    }

    public static int clearLastIBits(int n, int i) {

        int bitmask = -1 << i;

        return n & bitmask;
    }
}
