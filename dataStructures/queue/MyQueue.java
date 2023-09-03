package dataStructures.queue;

import java.util.ArrayList;
import java.util.List;

public class MyQueue {
    private List<Integer> data;
    private int front;
    
    public MyQueue() {
        data = new ArrayList<Integer>();
        front = 0;
    }

    public boolean enQueue(int elem) {
        data.add(elem);
        return true;
    }

    public boolean deQueue() {
        if(isEmpty()) return false;
        front++;
        return true;
    }

    public int front() {
        return data.get(front);
    }

    public boolean isEmpty() {
        return front >= data.size();
    }
    public static void main(String[] args) {
        MyQueue q = new MyQueue();
        q.enQueue(5);
        q.enQueue(3);
        if (q.isEmpty() == false) {
            System.out.println(q.front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.front());
        }
        q.deQueue();
        if (q.isEmpty() == false) {
            System.out.println(q.front());
        }
    }
}