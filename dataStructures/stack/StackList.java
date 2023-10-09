package dataStructures.stack;

import java.util.Stack;

import dataStructures.linkedList.Node;

public class StackList {
    Node head;
    int len;
    public StackList() {
        head = null;
        len = 0;
    }

    public void push(int elem) {
        Node n = new Node(elem);
        if(head == null) {
            head = n;
            len++;
            return;
        }
        n.next= head;
        head = n;
    }

    public int peek(){
        if(head == null) return 0;
        return head.value;
    }

    public int pop(){
        if(head == null) return 0;
        Node n = head;
        head = head.next;
        return n.value;
    }

    public static void main(String[] args) {
        StackList st = new StackList();
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.push(4);
        st.push(5);
        System.out.println(st.peek());
        System.out.println(st.pop());
         System.out.println(st.peek());
        
    }

    public boolean isEmpty() {
        return head == null;
    }
}
