package sorting;

public class SelectionSort{

    public static void main(String[] args){

        int[] array =  {5,4,1,3,2,9,8,7,6,0};

        selectionSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
    }

    public static void selectionSort(int[] array){

        for (int i = 0; i < array.length-1; i++) {

            int minPosition = i;
            for (int j = i+1; j < array.length; j++) {
                
                //for making, it reverses sort just change the below inequalities
                if (array[minPosition] > array[j]) {
                    minPosition = j;
                }

            }

            //swap
            int temp = array[minPosition];
            array[minPosition] = array[i];
            array[i] = temp;
        }
    }
} 