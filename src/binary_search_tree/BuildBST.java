package binary_search_tree;

import util.Node;

public class BuildBST {

    public static void main(String[] args){

        int[] values = {5,1,3,4,2,7};
        Node root = null;

        int n = values.length;

        for(int i = 0; i<n; i++){
            root = build(root,values[i]);
        }

        PrintBST.inorder(root);
        System.out.println();

    }

    public static Node build(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = build(root.left,val);
        }

        if(root.data < val){
            root.right = build(root.right,val);
        }

        return root;
    }

}
