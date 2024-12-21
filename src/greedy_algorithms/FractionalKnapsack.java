package greedy_algorithms;

import java.util.Arrays;
import java.util.Comparator;
public class FractionalKnapsack {

    public static void main(String[] args){
        int[] val = {60,100,120};
        int[] weight = {10,20,30};
        int W = 50;

        double[][] rate = new double[val.length][2];
        
        for(int i=0; i<val.length;i++){
            rate[i][0] = i;
            rate[i][1] = val[i]/(double)weight[i];
        }

        Arrays.sort(rate, Comparator.comparingDouble( o -> o[1]));
         
        int capacity = W;
        int finalVal = 0;

        for(int i = rate.length-1; i>= 0; i--){
            int idx = (int)rate[i][0];

            if(capacity >= weight[idx]){
                finalVal += val[idx];
                capacity -= weight[idx];
            }else{
                finalVal += (int) (rate[i][1]*capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println(finalVal);
    }
    
}
