package stacks;

import java.util.ArrayList;

public class StackCreationArrayList {

    public static class Stack<T> {
        private final ArrayList <T> list = new ArrayList<>();

        public boolean isEmpty(){
            return list.isEmpty();
        }
        public void push(T data){
            list.add(data);
        }
        public T pop(){
            if(isEmpty()){
                return null;
            }
            T top = list.getLast();
            list.removeLast();
            return top;
        }
        public T peek(){
            if(isEmpty()){
                return null;
            }
            return  list.getLast();
        }
    }
    public static void main(String[] args){

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
