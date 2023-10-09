package dataStructures.linkedList;

public class MyReverseLinkedList {

    public static void main(String[] args) {
        Node n = new Node(4);
        n.next = new Node(3);
        n.next.next = new Node(2);
        Node t = reverseItr(n);
        while(t != null){
            System.out.println(t.value);
            t = t.next;
        }
        
    }
    

  /**  private static Node reverse(Node n) {
        if(n == null) return n;
        Node tmp = n;
        Node head = n;
        while(tmp.next != null) {
            tmp.next = tmp;
            tmp = tmp.next;
        }

        return head;
    } */

    private static Node reverseh(Node n) {
        if(n == null || n.next == null) {
            return n;
        }
        Node rest = reverseh(n.next);
         n.next.next = n;
         n.next = null;
         return rest;

    }

    private static Node reverset(Node prev, Node n) {
        if(n == null) return n;
        if(n.next == null) {
            n.next = prev;
            return n;
        }

        Node next1 = n.next;
        n.next = prev;
        return reverset(n, next1);
    }

    private static Node reverseItr(Node n) {
        if(n == null || n.next == null) return n;
        Node prev = null;
         
        while(n != null) {
            Node next1 = n.next;
            n.next = prev;
            prev = n;
            n = next1;
        }
        return prev;
    } 
    
}
