package dataStructures.recursion;

public class Fibonaci {
    public static void main(String[] args) {
        System.out.println(getFibonaciIndexItr(8));
        System.out.println(getFibonaciValue(6));

          
    }

    private static int getFibonaciValue(int n) {
        if(n == 0) return 0; 
        if(n==1 || n==2) return 1;
        
        return getFibonaciValue(n-1) + getFibonaciValue(n-2);
    }

    private static int getFibonaciIndex(int n, int prev1, int prev2, int i) {
        if(n == prev1) return  0; 
        if(n == prev2) return 1;
        
        int val = prev1 + prev2;

        if(val == n) return i;
        if(val > n) return -1;
        i++;
        return getFibonaciIndex(n, prev2, val,i);
    }

    private static int getFibonaciIndexItr(int n) {
        int i=1;
        if(n == 0) return  0; 
        if(n == 1) return 1;
        int prev=0;
        int sum=1;
        while(n > sum) {
            int tmp = sum;
            sum = sum + prev;
            prev = tmp;
            i++;
        }

        if(sum == n) return i;
        return -1;
    }
}
