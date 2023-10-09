package dataStructures.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueArray {
    private int[] arr;
    private int len;
    
    public QueueArray() {
        arr = new int[100];
        len = 0;
    }

    public boolean add(int elem) {
        if(arr.length <= len) return false;
        arr[len] = elem;
        len++;
        return true;
    }

    public boolean remove() {
        if(len == 0) return false;
        int ret = arr[0];
        shiftLeft();
        len--;
        return true;
    }

    public int element(){
        return arr[0];
    }

    private void shiftLeft() {
        for(int i=1; i < len; i++) {
            arr[i-1] = arr[i];
        }
        arr[len-1] = 0; 
    }

    public static void main(String[] args) {
        /**Deque q = new ArrayDeque<>();
        q.add(5);
        q.remove();
        q.offer(2);
        //q.poll();
        q.element();
        q.peek();
        q.forEach(o -> System.out.println(o));
        q.addFirst(q); */

        QueueArray q = new QueueArray();
        q.add(3);
        q.add(4);
        System.out.println(q.element());
        q.remove();
        System.out.println(q.element());
    }

    
}
