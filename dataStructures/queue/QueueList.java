package dataStructures.queue;

import dataStructures.linkedList.Node;

public class QueueList {
    Node head; 
    Node tail;
    int len;
    public QueueList() {
        head = null;
        tail = null;
        len = 0;
    }

    public boolean add(int elem) {
        Node n = new Node(elem);
        if(tail == null){
            head = n;
            tail = n;
            len++;
            return true;
        }
        tail.next = n;
        tail = n;

        len++;
        return true;
    }

    public int remove() {
        if(head == null) return 0;
        
        Node n = head;
        head = head.next;
        
        return n.value;
    }

    public int element(){
        if(head == null) return 0;
        return head.value;
    }

    public static void main(String[] args) {
        QueueList q = new QueueList();
        q.add(3);
        q.add(4);
        System.out.println(q.element());
        q.remove();
        System.out.println(q.element());
         q.remove();
        System.out.println(q.element());
    }
}
