package sorting;

public class InsertionSort {

    public static void main(String[] args){

        int[] array = {1,2,3,5,4};
        insertionSort(array);
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j]+" ");
        }

    }

    public static void insertionSort(int[] array){

        int n = array.length;
        
        for(int i = 1; i<n; i++){
            int current = array[i];
            int previous = i-1;

            while( previous >= 0 && array[previous] > current){
                
            array[previous +1] = array[previous];
            
            previous--;
            }
            //insertion
            array[previous+1] = current;

        }
    }
}
