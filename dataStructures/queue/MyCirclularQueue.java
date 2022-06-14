package dataStructures.queue;
class MyCircularQueue {
    int head, tail;
    int[] queue;
    int len;
    
    public MyCircularQueue(int k) {
        head = -1;
        tail = -1;
        queue = new int[k];
        len = k;
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        if(isEmpty()) head = 0;
        tail = (tail + 1) % len;
        queue[tail] = value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        if(head == tail) {
            head = -1;
            tail = -1;
            return true;
        }
        head = (head + 1) % len;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return queue[head];
    }
    
    public int Rear() {
        if(isEmpty()) return -1;
        return queue[tail];
    }
    
    public boolean isEmpty() {
        return head == -1;
    }
    
    public boolean isFull() {
        return (tail+1) % len == head;
    }


 public static void main(String[] args) { 
  MyCircularQueue obj = new MyCircularQueue(3);
  obj.enQueue(2);
  obj.enQueue(3);
  obj.enQueue(4);
  System.out.println(obj.Rear());
  /** boolean param_2 = obj.deQueue();
  int param_3 = obj.Front();
  int param_4 = obj.Rear();
  boolean param_5 = obj.isEmpty();
  boolean param_6 = obj.isFull(); */
 }
}
