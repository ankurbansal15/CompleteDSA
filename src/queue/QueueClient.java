package queue;

import java.util.LinkedList;
import java.util.Queue;
public class QueueClient {

    public static void main(String[] args){
        Queue <Integer> q = new LinkedList<>(); // ArrayDeque can also be used

        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println(q.peek());

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }

        System.out.print(q.isEmpty());

    }
    
}
