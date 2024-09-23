package bit_manipulation;

public class SetIthBit {

    public static void main(String[] args){

        System.out.println(setIthBit(10,2));

    }

    public static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

}
