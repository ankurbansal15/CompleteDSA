package queue;

import java.util.Stack;
public class QueueUsingTwoStacks {

    private static class Queue{
        
        private final Stack <Integer> s1 = new Stack<>();
        private final Stack <Integer> s2 = new Stack<>();

        public boolean isEmpty(){
            return s1.isEmpty();
        }

        public void add(int data){

            while(!s1.isEmpty()){
                int temp = s1.pop();
                s2.push(temp);
            }
            s1.push(data);

            while(!s2.isEmpty()){
                int temp = s2.pop();
                s1.push(temp);
            }

        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.pop();
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }

            return s1.peek();
        }
    }

    public static void main(String[] args){

        Queue q = new Queue();

        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        q.add(4);
        System.out.println(q.remove());
    }
    
}
