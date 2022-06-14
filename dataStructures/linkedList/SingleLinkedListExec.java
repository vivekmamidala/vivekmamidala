package dataStructures.linkedList;

class SingleLinkedListExec {
public static void main(String[] args) {
    SingleLinkedList sl = new SingleLinkedList();
   //int param_1 = obj.get(index);
   sl.addAtHead(7);
   sl.addAtHead(2);
   sl.addAtHead(1);
   sl.addAtIndex(3,0);
   sl.deleteAtIndex(2);
   sl.addAtHead(6);
   sl.addAtTail(4);//6124
   System.out.println(sl.get(4));
}
}