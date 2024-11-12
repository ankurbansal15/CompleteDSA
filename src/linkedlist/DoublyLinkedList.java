package linkedlist;

public class DoublyLinkedList {

    public static class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public int removeFirst() {
        int val = head.data;
        if (head == null) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            head = tail = null;
            return val;
        }

        head = head.next;
        head.prev = null;
        size--;
        return val;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;

    }

    public int removeLast() {
        size--;
        int val = tail.data;
        if (head == null) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        if (head.next == null) {
            tail = head = null;
        }

        tail = tail.prev;
        tail.next = null;

        return val;
    }

    public void print() {
        if (head == null) {
            System.out.println("The Doubly Linked list is empty");
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("Null");
    }

    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }

        head = prev;


    }

    public static void main(String[] args) {

        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(5);
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.reverse();
        dll.print();

    }

}
