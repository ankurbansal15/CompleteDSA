package queue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {

    private final Deque<Integer> d = new LinkedList<>();

    public boolean isEmpty() {
        return d.isEmpty();
    }

    public void enqueue(int data) {
        d.addLast(data);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return d.removeFirst();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return d.peekFirst() != null ? d.peekFirst() : -1;
    }

    public static void main(String[] args) {
        QueueUsingDeque queue = new QueueUsingDeque();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
    }
}
