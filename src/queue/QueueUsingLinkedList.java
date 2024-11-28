package queue;

public class QueueUsingLinkedList {

    private static class Node{

        public int data;
        public Node next;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private static class Queue{

        private Node head = null;
        private Node tail = null;

        public boolean isEmpty(){
            return tail == null && head == null;
        }

        public void add(int data){
            Node newNode = new  Node(data);

            if(head == null){
                head = tail = newNode;
                return;
            }

            tail.next = newNode;
            tail = newNode;

        }

        public int remove(){
            
            if(isEmpty()){
                System.out.println("Queue is empty");
                return Integer.MIN_VALUE;
            }
            int val = head.data;
            if(tail == head){
                head = tail = null;
                return val;
            }
            head = head.next;
            return val;

        }

        public int peek(){
            if(isEmpty()){
                System.out.print("Queue is empty");
                return -1;
            }
            
            return head.data;
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
