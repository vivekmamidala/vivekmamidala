package dataStructures.linkedList;

public class MySingleLinkedListExc {
    public static void main(String[] arg) {
        MySingleLinkedList sl = new MySingleLinkedList();
        //int param_1 = obj.get(index);
        sl.append(7);
        sl.append(2);
        sl.append(1);
        sl.appendAt(6,0);
        sl.deleteAt(2);
        sl.append(6);
       // sl.addAtTail(4);//6124
       // System.out.println(sl.get(4));
       sl.print();
    }
}
