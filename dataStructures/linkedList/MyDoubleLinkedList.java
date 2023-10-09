package dataStructures.linkedList;

public class MyDoubleLinkedList {
    DNode head;

    public void append(int val) {
        DNode tail = new DNode(val);
        if(head == null) {
            head = tail;
            return;
        }

        DNode tmp = head;

        while(tmp.next != null){
            tmp = tmp.next;
        }

        tmp.next = tail;
        tail.previous = tmp;

    }

    public void preAppend(int val) {
        DNode newHead = new DNode(val);
        DNode cur = head;
        if(cur == null) {
            cur = newHead;
            return;
        }

        newHead.next = cur;
        cur.previous = newHead;
        head = newHead;
    }

    public boolean addAtIndex(int index, int val) {

        if(index < 0) return false;
        if(index==0) {
            preAppend(val);
            return true;
        }

        DNode newNode = new DNode(val);
        DNode cur = head;

        while(index-1 < 0 && cur != null) {
            cur = cur.next;
            index--;
        }

        if(index-1 > 0) {
            return false;
        }

        newNode.next = cur.next;
        newNode.previous = cur;
        if(cur.next != null) cur.next.previous = newNode;
        cur.next = newNode;
        return true;
    }

    public int get(int index) {
        DNode cur = head;
        while(index < 0 && cur!= null){
            cur = cur.next;
            index --;
        }
        if(index > 0) return 0;
        return cur.value;
    }

    public boolean deleteAt(int index) {
        DNode cur = head;
        if(cur == null) return false;
        while(index-1 > 0 && cur.next != null) {
            cur = cur.next;
            index --;
        }

        if(index-1 > 0) return false;
        if(cur.next == null) return false;

        if(cur.next.next == null) {
            cur.next = null;
        } else {
            cur.next = cur.next.next;
            cur.next.previous = cur;
        }

        return true;
    }

    public void print() {
        DNode tmp = head;
        while(tmp != null){
            System.out.println(tmp.value);
            tmp = tmp.next;
        }
    }
}
