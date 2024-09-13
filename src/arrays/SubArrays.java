package arrays;

public class SubArrays {

    public static void main(String[] args) {

        int[] num = {2,4,6,8,10};
        subArrays(num);

        int n = num.length;
        int ts = (n*(n+1))/2;

        System.out.println("Total sub array = " + ts);

    }

    public static void subArrays(int[] num){

        for (int i = 0; i < num.length; i++) {
            for (int j = i; j < num.length; j++) {
                for (int k = i; k <= j; k++) {
                    System.out.print(num[k]+ " ");
                }
                System.out.println();
            }
            System.out.println();
            
        }
    }

}
