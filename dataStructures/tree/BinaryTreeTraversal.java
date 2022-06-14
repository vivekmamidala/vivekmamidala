package dataStructures.tree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class BinaryTreeTraversal {

    public static void main(String[] args) {
        BinaryTreeTraversal btt = new BinaryTreeTraversal();
        BinaryTreeNode child2 = new BinaryTreeNode(3);
    BinaryTreeNode child1 = new BinaryTreeNode(2, child2, null);
    BinaryTreeNode root = new BinaryTreeNode(1, null, child1);
    //List<Integer> res = new ArrayList<Integer>();
    //btt.postOrderTraversalRec(root, res);  
    //btt.preOrderTraversalIter(node); 
    List<Integer> res = btt.postOrderTraversalIter(root);
    for(int i : res) System.out.println(i);
    }

    private void preOrderTraversalRec(BinaryTreeNode root, List<Integer> res) {
        if(root == null) return;
        res.add(root.val);
        preOrderTraversalRec(root.left, res);
        preOrderTraversalRec(root.right, res);
    }

    private List<Integer> preOrderTraversalIter(BinaryTreeNode root) {
        Stack<BinaryTreeNode> st = new Stack<BinaryTreeNode>();
        List<Integer> res = new ArrayList<>();
        while(root != null || !st.isEmpty()) {
            if(root != null) {
                res.add(root.val);
                if(root.right != null) st.push(root.right);
                root = root.left;
                
            } else {
                root = st.pop();
            }
        }
        return res;
    }

    private void inOrderTraversalRec(BinaryTreeNode root, List<Integer> res) {
        if(root == null) return;
        preOrderTraversalRec(root.left, res);
        res.add(root.val);
        preOrderTraversalRec(root.right, res);
    }

    private List<Integer> inOrderTraversalIter(BinaryTreeNode root) {
        Stack<BinaryTreeNode> st = new Stack<BinaryTreeNode>();
        List<Integer> res = new ArrayList<>();
        //st.push(root);
        //if every node is processed then quit
        while(root != null || !st.isEmpty()) {
            if(root != null) {
                st.push(root);
                root = root.left;
            } else{
                root = st.pop();
                res.add(root.val);
                root =root.right;
            }
        }
        return res;
    }

    private void postOrderTraversalRec(BinaryTreeNode root, List<Integer> res) {
        if(root == null) return;
        postOrderTraversalRec(root.left, res);
        postOrderTraversalRec(root.right, res);
        res.add(root.val);
    }

    private List<Integer> postOrderTraversalIter(BinaryTreeNode root) {
        Stack<BinaryTreeNode> st = new Stack<BinaryTreeode>();
        List<Integer> res = new ArrayList<>();
        while(root != null || !st.isEmpty()) {
            if(root != null) {
                st.push(root);
                //if(root.right != null) st.push(root.right);
                root = root.left;
            } else {
                root = st.pop();
                root = root.right;
            }
        }
        return res;
    }

}