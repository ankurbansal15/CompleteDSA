package linkedlist;

public class LinkedList {

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

    public void addFirst(int data) {

        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;

        }
        newNode.next = head;
        head = newNode;
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

    public void addMiddle(int index, int data) {

        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;

        int i = 0;
        Node temp = head;
        while (i < index - 1) {

            temp = temp.next;
            i = i + 1;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {

        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;

            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        int val = tail.data;

        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }

        if (size == 1) {

            head = tail = null;
            size--;
            return val;
        }

        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = head.next;
        }

        temp.next.next = null;
        tail = temp;
        size--;
        return val;

    }

    public int iterativeSearch(int key) {

        int i = 0;
        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {
                return i;
            } else {
                temp = temp.next;
                i++;
            }
        }
        return -1;
    }

    public int helper(Node head, int key) {

        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }

        return idx + 1;
    }

    public int recursiveSearch(int key) {
        return helper(head, key);
    }

    public void reverse() {

        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        head = prev;

    }

    public void removeFromNth(int n) {

        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            assert head != null;
            head = head.next;
            return;
        }

        Node prev = head;

        int i = 1;
        while (i < sz - n) {
            prev = prev.next;
            i++;
        }

        prev.next = prev.next.next;
    }

    public void print() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public Node findMiddle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null) {
            return slow.next;
        }

        return slow;
    }

    public boolean palindrome() {

        if (head == null || head.next == null) {
            return true;
        }

        Node mid = findMiddle(head);

        Node prev = null;
        Node curr = mid;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;
        while (right != null) {

            if (left.data != right.data) {
                return false;
            }

            left = left.next;
            right = right.next;
        }
        return true;
    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergeLl = new Node(-1);
        Node temp = mergeLl;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;

            }
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergeLl.next;
    }

    public void zigzag() {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        Node mid = slow;


        Node rightHead = mid.next;
        mid.next = null;
        Node prev = null;
        Node curr = rightHead;
        Node next;
        while (curr != null) {

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        Node nextLeft, nextRight;

        while (left != null && right != null) {
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;

            right = nextRight;
            left = nextLeft;

        }
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);


        ll.print();

        System.out.println(size);

        System.out.println(ll.removeFirst());
        ll.print();
        System.out.println(size);

        System.out.println(ll.removeLast());
        ll.print();

        int key = ll.iterativeSearch(3);
        System.out.println(key);

        int position = ll.recursiveSearch(3);
        System.out.println(position);
        System.out.println(ll.recursiveSearch(10));

        ll.reverse();
        ll.print();

        ll.removeFromNth(3);
        ll.print();

        System.out.println(ll.palindrome());

        head = ll.mergeSort(head);

        ll.zigzag();
        ll.print();

    }

}
