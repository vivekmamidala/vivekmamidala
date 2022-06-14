package dataStructures.linkedList;

class SingleLinkedList {
    public class Node {
        int data;
        Node next;

        private Node(int data){
            this.data = data;
        }
    }
    Node head;



public SingleLinkedList(int val) {
    head = new Node(val);
}

public SingleLinkedList() {
}

public int get(int index) {
    int itrIndx = 0;
    Node cur = head;
    while(cur != null) {
        if(itrIndx == index) return cur.data;
        cur = cur.next;
        itrIndx ++;
    }
    return -1;
}

public void addAtHead(int val) {
    Node newHead = new Node(val);
    newHead.next = head;
    head = newHead;
}

public void addAtTail(int val) {
    Node cur = head;
    Node tail = new Node(val);
    if(cur == null) {
        head = tail;
        return;
    }
    while(cur.next != null) {
        cur = cur.next;
    }
    
    cur.next = tail;
}

public void addAtIndex(int index, int val) {
    Node newNode = new Node(val);
    int itrIndx = 0;
    Node cur = head;
    if(cur == null && index == 0) {
        addAtHead(val);
        return;
    }
    if(index == 0)  {
        addAtHead(val);
        return;
    }
    while(cur != null) {
        if(itrIndx == index-1) {
            newNode.next = cur.next;
            cur.next = newNode;
            return;
        }
        cur = cur.next;
        itrIndx++;
    }
}

public void deleteAtIndex(int index) {
    int itrIndx = 0;
    Node cur = head;
    if(cur == null) return;
    if(index == 0) head = head.next;
    while(cur.next != null) {
        if(itrIndx == index-1) {
            cur.next = cur.next.next;
            return;
        } 
        cur = cur.next;
        itrIndx++;
    }
    
}
}