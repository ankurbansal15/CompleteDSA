package arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {

    public static void swap(ArrayList<Integer> list, int idx1,int idx2){

        int temp = list.get(idx1);
        
        list.set(idx1,list.get(idx2));
        list.set(idx2,temp);
    }

    public static void main(String[] args){
        
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int i = 1, j = 3;

        swap(list,i,j);

        System.out.println(list);

        Collections.sort(list);
        System.out.println("Sorted list is :");
        System.out.println(list);

        System.out.println("Sorted list in descending order is :");
        list.sort(Collections.reverseOrder());
        System.out.println(list);
    }
    
}
