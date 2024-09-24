package recursion;

public class TowerOfHanoi {

    public static void main(String[] args){
        
        int n = 3;
        steps(n,"A","C","B");

    }
    
    public static void steps(int n, String src, String dest, String helper){

        if(n == 0){
            return;
        }

        steps(n-1,src,helper,dest);

        System.out.println("Transfer Disk "+n+" form "+src+" to "+dest);

        steps(n-1,helper,dest,src);

    }
}
