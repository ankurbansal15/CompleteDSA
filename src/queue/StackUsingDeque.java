package queue;

import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {

        private final Deque<Integer> d = new LinkedList<>();

        public boolean isEmpty() {
            return d.isEmpty();
        }

        public void push(int data) {
            d.addFirst(data);
        }

        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return d.removeFirst();
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

            return d.peekFirst() != null ? d.peekFirst() : -1;
        }

        public static void main(String[] args) {
            StackUsingDeque stack = new StackUsingDeque();

            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);

            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
            System.out.println(stack.pop());
        }
}
