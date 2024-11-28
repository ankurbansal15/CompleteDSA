package queue;

public class QueueUsingArray {

    private static class Queue {
        private final int[] arr;
        private final int size;
        private int rear;

        public Queue(int size) {
            this.arr = new int[size];
            this.size = size;
            this.rear = -1;
        }

        public boolean isEmpty() {
            return this.rear == -1;
        }

        public void add(int data) {

            if (this.rear == this.size - 1) {
                System.out.println("Queue is full");
                return;
            }
            this.rear = this.rear + 1;
            this.arr[this.rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = this.arr[0];
            for (int i = 0; i < this.rear; i++) {
                this.arr[i] = this.arr[i + 1];
            }
            this.rear = this.rear - 1;
            return front;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return arr[0];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        q.add(4);
        System.out.println(q.remove());

    }
}
