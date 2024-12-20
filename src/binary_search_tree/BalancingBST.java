package binary_search_tree;

import util.Node;
import java.util.ArrayList;

public class BalancingBST {

    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);

        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);

        PrintBST.preOrder(root);

        root = BalanceBst(root);

        System.out.println();

        PrintBST.preOrder(root);

    }
    public static Node BalanceBst(Node root){

        ArrayList <Integer> arr = new ArrayList<>();
        getInorder(root,arr);

        root = makeBST(arr,0,arr.size()-1);

        return root;

    }

    public static Node makeBST(ArrayList<Integer> arr,int st, int end){

        if(st>end){
            return null;
        }

        int mid = (st+end)/2;
        Node root = new Node(arr.get(mid));
        root.left = makeBST(arr,st,mid-1);
        root.right = makeBST(arr,mid+1,end);

        return root;

    }

    public static void getInorder(Node root, ArrayList<Integer> arr){

        if(root == null){
            return;
        }
        getInorder(root.left,arr);
        arr.add(root.data);
        getInorder(root.right,arr);
    }
}
