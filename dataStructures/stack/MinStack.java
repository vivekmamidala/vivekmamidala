package dataStructures.stack;
public class MinStack {
    class Node {
        int val;
        int min;
        Node next;
        public Node(int val, int min, Node next) {
            this.val = val;
            this.min = min;
            this.next = next;
        }
    }

    Node head;
    public MinStack() {
        head = null;
    }
    
    public void push(int val) {
        if(isEmpty()) head = new Node(val, val, null);
        else head = new Node(val, val < head.min ? val : head.min, head);
    }
    
    public void pop() {
        head = head.next;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}