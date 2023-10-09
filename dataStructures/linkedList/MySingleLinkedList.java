package dataStructures.linkedList;

public class MySingleLinkedList {
    Node head;
    Node tail;

    public MySingleLinkedList(int element) {
        head = new Node(element);
    }

    public MySingleLinkedList(){

    }

    public void append(int element) {

        if(head == null){
            head = new Node(element);
            return;
        } 

        Node tmp = head;
        
        while(tmp.next != null){
            tmp = tmp.next;
        }

        tmp.next = new Node(element);
    }

    public void preAppend(int element) {
        Node tmp = new Node(element);
        tmp.next = head;
        head = tmp;
    }

    public boolean appendAt(int index, int element) {
        if(index == 0) {
            preAppend(element);
            return true;
        }
        
        Node tmp = head;

        while(tmp != null && index-1 > 0) {
            tmp = tmp.next;
            index --;
        }

        if(index > 1) return false;
        Node n = new Node(element);
        n.next = tmp.next;
        tmp.next = n;
        return true;
    
    }

    public boolean deleteAt(int index) {
        Node tmp = head;
        while(tmp != null && tmp.next != null && index-1>0) {
            tmp = tmp.next;
            index --;
        }

        if(tmp == null || tmp.next == null) return false;

        Node d = tmp.next;
        tmp.next = tmp.next.next;
        d.next = null;



        return true;
    }

    public void print() {
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }

    private Node reverse(Node prev, Node n) {
        if(head == null) return head;
        if(n.next == null) {
            n.next = prev;
            head = n;
            return head;
        }

        Node next1 = n.next;
        n.next = prev;
        reverse(n, next1);
        return head;
    }
}


