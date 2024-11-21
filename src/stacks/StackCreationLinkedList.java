package stacks;

public class StackCreationLinkedList {

    public static class Node<T> {

        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }

    }

    public static class Stack<T> {
        public Node<T> head = null;

        public boolean isEmpty(){
            return head == null;
        }

        public void push(T data){
            Node<T> newNode = new Node<>(data);

            if(isEmpty()){
                head = newNode;
                return;
            }

            newNode.next = head;
            head = newNode;

        }

        public T pop(){

            if(isEmpty()){
                return null;
            }

            T top = head.data;

            head = head.next;
            return top;

        } 

        public T peek(){

            if(isEmpty()){
                return null;
            }

            return head.data;
        }

    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
        
    }

}
