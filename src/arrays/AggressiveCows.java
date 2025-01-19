package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AggressiveCows {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while(t-- > 0){
            int n = scanner.nextInt();
            int c = scanner.nextInt();
            int[] poles = new int[n];
            for(int i = 0;i<n;i++){
                poles[i] = scanner.nextInt();
            }
            Arrays.sort(poles);
            int left = 0;
            int right = poles[n-1] - poles[0];
            int ans = 0;
            while(left <= right){
                int mid = left + (right - left)/2;
                if(isPossible(poles,c,mid)){
                    left = mid + 1;
                    ans = mid;
                }else{
                    right = mid - 1;
                }
            }
            System.out.println(ans);
        }

    }
    private static boolean isPossible(int[] poles, int c, int minDis){
        int count = 1;
        int lastPole = poles[0];
        for(int i = 1;i<poles.length;i++){
            if(lastPole + minDis <= poles[i]){
                count++;
                lastPole = poles[i];
            }
            if(count == c){
                return true;
            }
        }
        return false;
    }
}
