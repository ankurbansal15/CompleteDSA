package recursion;

public class FirstOccurrenceOfKey {
    public static void main(String[] args){

        int[] arr = {8,3,6,9,5,10,2,5,3};
        int key = 5;
        System.out.print(position(arr,key,0));
    }

    public static int position(int[] arr, int key, int i){

        if(i == arr.length-1){
            return -1;
        }
        
        if(arr[i] == key){
            return i;
        }

        return position(arr,key,i+1);
    }
}