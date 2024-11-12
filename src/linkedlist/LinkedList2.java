package linkedlist;

public class LinkedList2 {

    public static Node head;
    public static Node tail;
    public static int size;

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            tail.next = null;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public boolean detectLoop() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    public void removeLoop() {
        Node slow = head;
        Node fast = head;
        boolean loop = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                loop = true;
                break;
            }
        }

        if (loop) {
            slow = head;
            Node prev = null;
            while (slow != fast) {
                prev = fast;
                slow = slow.next;
                fast = fast.next;
            }

            assert prev != null;
            prev.next = null;
        }
    }

    public static void main(String[] args) {
        LinkedList2 ll = new LinkedList2();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addLast(7);

        tail.next = head.next.next;

        System.out.println(ll.detectLoop());
        ll.removeLoop();
        System.out.println(ll.detectLoop());
    }
}