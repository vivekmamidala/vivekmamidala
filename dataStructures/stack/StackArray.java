package dataStructures.stack;

public class StackArray {
    int[] arr;
    int indx;

    public StackArray() {
        arr = new int[100];
        indx = -1;
    }

    public void push(int elem) {
        arr[++indx] = elem;
    }

    public int peek() {
        if(indx == -1) return arr[0];
        return arr[indx];
    }

    public int pop() {
        if(indx == -1) return arr[0];
        int val = arr[indx];
        arr[indx] = 0;
        indx--;
        return val;
    }

    public static void main(String[] args) {
        StackArray st = new StackArray();
        st.push(2);
        st.push(3);
        System.out.println(st.peek());
        System.out.println(st.pop());
        st.push(4);
        st.push(5);
        System.out.println(st.peek());
        System.out.println(st.pop());
         System.out.println(st.peek());
        
    }
}
