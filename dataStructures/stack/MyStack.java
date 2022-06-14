package dataStructures.stack;

import java.util.ArrayList;
import java.util.List;

public class MyStack {
    private List<Integer> data;
    
    public MyStack() {
        data = new ArrayList<Integer>();
    }

    public void push(int element) {
        data.add(element);
    }

    public int pop() {
        if(isEmpty()) return -1;
        return data.remove(data.size()-1);
    }

    public boolean isEmpty() {
        return data.size() == 0;
    }

    public int top() {
        if(isEmpty()) return -1;
        return data.get(data.size()-1);
    }

    public List<Integer> getData() {
        return data;
    }
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(1);
        st.push(2);
        st.push(3);
        System.out.println(st.pop());
        System.out.println(st.top());
    }

    }
