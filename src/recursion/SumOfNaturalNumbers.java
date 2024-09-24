package recursion;

public class SumOfNaturalNumbers {

    public static void main(String[] args){

        System.out.print(Sum(10));
    }

    public static int Sum(int n){
        if(n == 1 ){
            return 1;
        }

        return n + Sum(n-1);
    }
    
}
