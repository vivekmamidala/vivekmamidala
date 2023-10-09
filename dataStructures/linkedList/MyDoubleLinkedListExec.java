package dataStructures.linkedList;

public class MyDoubleLinkedListExec {
    public static void main(String[] args) {
        MyDoubleLinkedList sl = new MyDoubleLinkedList();
        //int param_1 = obj.get(index);
        sl.append(7);
        sl.append(2);
        sl.append(1);
        sl.print();
        sl.addAtIndex(1,0);
        sl.deleteAt(2);
        sl.preAppend(6);
       // sl.addAtTail(4);//6124
       // System.out.println(sl.get(4));
       sl.print();
    }
}
