package dataStructures.queue;

import dataStructures.stack.StackList;

public class QueueStack {
    StackList primarySt;
    StackList secondarySt;

    public QueueStack() {
        primarySt = new StackList();
        secondarySt = new StackList();
    }

    public boolean push(int elem) {
        while(!secondarySt.isEmpty()) {
            primarySt.push(secondarySt.pop());
        }
        primarySt.push(elem);
        return true;
    }

    public int pop() {
        while(!primarySt.isEmpty()) {
            secondarySt.push(primarySt.pop());
        }
        int ret = secondarySt.pop();
        
        return ret;
    }

    public int peek() {
        while(!primarySt.isEmpty()) {
            secondarySt.push(primarySt.pop());
        
        }
        return secondarySt.peek();
    }
    public static void main(String[] args) {
        QueueStack q = new QueueStack();
        q.push(3);
        q.push(5);
        System.out.println(q.peek());
        q.push(4);

        System.out.println("pop" + q.pop());
        System.out.println(q.peek());
         System.out.println("pop" + q.pop());
        System.out.println(q.peek());
    }

}
