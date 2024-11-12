package linkedlist;

import java.util.LinkedList;

public class LinkedListClient {
 
    public static void main(String[] args){

        LinkedList <Integer> ll = new LinkedList<>();

        ll.addLast(1);
        ll.addLast(2);

        System.out.println(ll);

        ll.addFirst(0);

        System.out.println();

        ll.removeFirst();

        System.out.println();

    }
}
