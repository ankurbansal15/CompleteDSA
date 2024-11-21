package stacks;

import java.util.Stack;

public class ReverseStackRecursion {

    public static void main(String[] args){

        Stack <Integer> list = new Stack<>();

        list.push(1);
        list.push(2);
        list.push(3);

        reverse(list);

        print(list);

    }

    public static void print(Stack <Integer> list){

        while(!list.isEmpty()){
            System.out.println(list.pop());
        }
    }

    public static void pushAtBottom(Stack<Integer> s,int data){

        if(s.isEmpty()){
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s,data);
        s.push(top);

    }

    public static void reverse(Stack <Integer> list){

        if(list.isEmpty()){
            return;
        }
        
        int top = list.pop();
        reverse(list);
        pushAtBottom(list,top);

    }

}
