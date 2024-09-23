package bit_manipulation;

public class UpdateIthBit {

    public static void main(String[] args){

        System.out.println(updateIthBit(10,2,1));
        System.out.println(updateIthBit2(10,2,1));

    }

    public static int updateIthBit(int n, int i, int newBit){
         if (newBit == 1) {
             return set_ith_bit(n, i);
         } else {

            return clear_ith_bit(n, i);
         }
    }


    public static int updateIthBit2(int n, int i, int newBit) {

        n = clear_ith_bit(n, i);
        int Bitmask = newBit<<i;
        return n | Bitmask;
    }

    public static int set_ith_bit(int n, int i) {

        int bitmask = 1 << i;
        return n | bitmask;
    }

    public static int clear_ith_bit(int n, int i) {

        int bitmask = ~(1 << i);
        return n & bitmask;
    }
}
