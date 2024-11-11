package arraylist;

import java.util.ArrayList;

public class ArrayListOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        System.out.println(list);


        int a = list.get(4);

        System.out.println("Element at index 4 is " + a);


        list.remove(2);
        System.out.println("List after removing a element at index 2 from the list");
        System.out.println(list);


        list.set(0, 99);
        System.out.println("List after setting 99 at 0th index");
        System.out.println(list);

        System.out.println("Checking for the element that does not present");
        System.out.println(list.contains(200));
        System.out.println("Checking for the element that present in the list");
        System.out.println(list.contains(99));


        list.add(4, 8888);
        System.out.println("List after adding 8888 at 4th index");
        System.out.println(list);

        System.out.println("Getting the size of array list");
        System.out.println(list.size());

    }
}
