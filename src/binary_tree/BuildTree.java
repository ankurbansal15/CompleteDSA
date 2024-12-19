package binary_tree;

import util.Node;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTree {

    public static void main(String[] args) {

        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1, -1};

        Node root = buildTreeLevelOrder(nodes);
        if(root == null){
            System.out.println("Tree is empty");
        }else{
            System.out.println(root.data);
        }
        root = buildTreePreOrder(nodes,-1);
        if(root == null){
            System.out.println("Tree is empty");
        }else{
            System.out.println(root.data);
        }
        root = buildTreeInOrder(nodes,0,nodes.length-1,0);
        if(root == null){
            System.out.println("Tree is empty");
        }else{
            System.out.println(root.data);
        }
        root = buildTreePostOrder(nodes,nodes.length-1);
        if(root == null){
            System.out.println("Tree is empty");
        }else{
            System.out.println(root.data);
        }
    }
    public static Node buildTreeLevelOrder(int[] levelOrder ){
        if(levelOrder.length == 0){
            return null;
        }
        Node root = new Node(levelOrder[0]);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(i < levelOrder.length){
            Node curr = q.poll();
            if(i < levelOrder.length && levelOrder[i] != -1 && curr != null){
                curr.left = new Node(levelOrder[i]);
                q.add(curr.left);
            }
            i++;
            if(i < levelOrder.length && levelOrder[i] != -1 && curr != null){
                curr.right = new Node(levelOrder[i]);
                q.add(curr.right);
            }
            i++;
        }
        return root;
    }


    public static Node buildTreePreOrder(int[] nodes, Integer idx) {
        idx++;
        if (idx >= nodes.length || nodes[idx] == -1) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTreePreOrder(nodes,idx);
        newNode.right = buildTreePreOrder(nodes,idx);

        return newNode;
    }

    public static Node buildTreeInOrder(int[] nodes, int start, int end,Integer idx) {
        if (idx >= nodes.length || start > end) {
            return null;
        }

        Node newNode = new Node(nodes[idx]);
        int mid = findIndex(nodes, start, end, newNode.data);
        idx++;
        newNode.left = buildTreeInOrder(nodes, start, mid - 1,idx);
        newNode.right = buildTreeInOrder(nodes, mid + 1, end,idx);

        return newNode;
    }

    public static int findIndex(int[] nodes, int start, int end, int target) {
        for (int i = start; i <= end; i++) {
            if (nodes[i] == target) {
                return i;
            }
        }
        return -1;
    }

    private static Node buildTreePostOrder(int[] nodes,Integer idx) {
        if (idx < 0 || nodes[idx] == -1) {
            idx--;
            return null;
        }
        Node newNode = new Node(nodes[idx--]);
        newNode.right = buildTreePostOrder(nodes,idx);
        newNode.left = buildTreePostOrder(nodes,idx);

        return newNode;
    }

}