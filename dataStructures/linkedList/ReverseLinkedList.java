package dataStructures.linkedList;
import dataStructures.linkedList.SingleLinkedList.Node;

public class ReverseLinkedList {
    public static void main(String[] args) {
        SingleLinkedList s1 = new SingleLinkedList();
   //int param_1 = obj.get(index);
   s1.addAtHead(7);
   s1.addAtTail(4);//6124
   System.out.println("after reversing");
   Node h = reverseList(s1.head);
   while(h != null) {
   System.out.println(h.data);
   h = h.next;
   }
    }

    public static Node reverseList(Node head) {
        /*if(head == null) return null;
        if(head.next == null) return head;
        ListNode p = head;
        
        while(p != null && p.next != null) {*/
        Node p = head;
        if(p == null || p.next == null) return p;
        Node tmp = p.next;
        p.next = p.next.next;
        tmp.next =  p;
        return reverseList(p);
    }
} 