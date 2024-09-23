package bit_manipulation;

public class GetIthBit {

    public static void main(String[] args) {
        System.out.println(getIThBit(10, 3));

    }

    public static int getIThBit(int n, int i) {
        int bitmask = 1 << i;

        if ((n & bitmask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }
}
