package dataStructures.tree;

public class BinarySearchTree {
    BinaryTreeNode btn;

    public BinarySearchTree() {
        btn = null;
    }

    public void insert(int elem) {
        BinaryTreeNode n = new BinaryTreeNode(elem);
        if(btn == null) {
            btn = n;
            return;
        }
        BinaryTreeNode cur = btn;
        while(cur != null) {
            if(elem < cur.val) {
                if(cur.left == null) {
                    cur.left = n;
                    return;
                }
                cur = cur.left;
            } else {
                if(cur.right == null) {
                    cur.right = n;
                    return;
                }
                cur = cur.right;
            }
        }
        
    }

    public void insertRec(int elem) {
        insertRec(btn, elem);
    }

     private void insertRec(BinaryTreeNode cur, int elem) {
        if(cur == null) {
            btn = new BinaryTreeNode(elem);
            return;
        }
        if(elem < cur.val) {
            if(cur.left == null) cur.left = new BinaryTreeNode(elem);
            else insertRec(cur.left, elem);
            return;
        } else {
            if(cur.right == null) cur.right = new BinaryTreeNode(elem);
            else insertRec(cur.right, elem);
            return;
        }
    }

    private boolean find(int elem) {
        return find(btn, elem);
    }
    
    private boolean find(BinaryTreeNode cur, int elem) {
        if(cur == null) return false;
        else if(cur.val == elem) return true;
        else if(elem > cur.val) return find(cur.right, elem);
        else return find(cur.left, elem);
    }

    private boolean remove(int elem){
        return remove(btn, elem);
    }

    private boolean remove(BinaryTreeNode cur, int elem) {
        if(cur == null) return false;
        if(cur.val == elem) {
            if(cur.left != null) cur = cur.left;
            cur = null;

            return true;
        }
         if(elem > cur.val) return remove(cur.right, elem);
         else return remove(cur.left, elem);
    }

    private void traverse() {
        BinaryTreeNode cur = btn;
        traverseInorder(cur);
    }

    //traverse inorder -> left, root, right
    private void traverseInorder(BinaryTreeNode cur) {
        if(cur == null) return;
        if(cur.left != null) traverseInorder(cur.left);
        System.out.println(cur.val);
        if(cur.right != null) traverseInorder(cur.right);
    }

    private void traversePreOrder(BinaryTreeNode cur) {
        if(cur == null) return;
        System.out.println(cur.val);
        if(cur.left != null) traversePreOrder(cur.left);
        if(cur.right != null) traversePreOrder(cur.right);
    }

     private void traversePostOrder(BinaryTreeNode cur) {
        if(cur == null) return;
        if(cur.left != null) traversePostOrder(cur.left);
        if(cur.right != null) traversePostOrder(cur.right);
        System.out.println(cur.val);
    }

    public static void main(String[] args) {
        BinarySearchTree bt = new BinarySearchTree();
        bt.insertRec(9);
        bt.insertRec(4);
        bt.insertRec(6);
        bt.insertRec(20);
        bt.insertRec(170);
        bt.insertRec(15);
        bt.insertRec(1);
        bt.traverse();
        System.out.println(bt.find(120));

    }

   
}
