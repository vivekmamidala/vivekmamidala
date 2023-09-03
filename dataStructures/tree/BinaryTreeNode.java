package dataStructures.tree;
public class BinaryTreeNode {
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;

    public BinaryTreeNode(int data, BinaryTreeNode left, BinaryTreeNode right) {
        this.val = data;
        this.left = left;
        this.right = right;
    }

    public BinaryTreeNode(int data) {
        this.val = data;
    }
}