package binary_search_tree;

import util.Node;

import java.util.ArrayList;

public class MergeBST {

    public static void main(String[] args) {

        /*
         * 2
         * / \
         * 1 4
         */
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        /*
         * 9
         * / \
         * 3 12
         */
        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root =  mergeBST(root1,root2);

        PrintBST.preOrder(root);

    }

    public static Node mergeBST(Node root1, Node root2) {

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();

        inOrder(root1, list1);
        inOrder(root2, list2);

        ArrayList<Integer> main = new ArrayList<>();
        int j = 0, k = 0;
        while (j < list1.size() && k < list2.size()) {
            if (list1.get(j) <= list2.get(k)) {
                main.add(list1.get(j));
                j++;
            } else {
                main.add(list2.get(k));
                k++;
            }
        }

        while (j < list1.size()) {
            main.add(list1.get(j));
            j++;
        }

        while (k < list2.size()) {
            main.add(list2.get(k));
            k++;
        }

        return createBst(main, 0, main.size() - 1);

    }

    public static void inOrder(Node root, ArrayList<Integer> list) {

        if (root == null) {
            return;
        }

        inOrder(root.left, list);
        list.add(root.data);
        inOrder(root.right, list);

    }

    public static Node createBst(ArrayList<Integer> list, int str, int end) {

        if (str > end) {
            return null;
        }

        int mid = (str + end) / 2;

        Node root = new Node(list.get(mid));
        root.left = createBst(list, str, mid-1);
        root.right = createBst(list, mid + 1, end);

        return root;
    }

}
