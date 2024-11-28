package queue;

public class CircularQueueUsingArray {

    private static class Queue {
        private int[] arr;
        private int size;
        private int rear;
        private int front;

        public Queue(int size) {
            this.arr = new int[size];
            this.size = size;
            this.rear = -1;
            this.front = -1;
        }

        public boolean isEmpty() {
            return this.rear == -1 && this.front == -1;
        }

        public boolean isFull() {
            return (this.rear + 1) % this.size == this.front;

        }

        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            if (this.front == -1) {
                this.front = 0;
            }
            this.rear = (this.rear + 1) % this.size;
            this.arr[this.rear] = data;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int result = this.arr[this.front];

            if (this.rear == this.front) {
                this.rear = this.front = -1;
            } else {
                this.front = (this.front + 1) % this.size;
            }
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return this.arr[this.front];
        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.add(1);
        q.add(2);
        q.add(3);

        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }

}
