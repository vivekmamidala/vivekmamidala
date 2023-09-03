package dataStructures.array;

import java.util.Arrays;

public class MergeSortedArrays {
    public static void main(String[] args) {
        int[] a = new int[]{1,3,9};
        int[] b = new int[]{2,5,8};
        int[] t = mergeArrays(a, b);
        Arrays.stream(t).forEach(p -> System.out.println(p));
    }
    private static int[] mergeArrays(int[] a, int[] b) {
        int aLength = a.length;
        int bLength = b.length; 
        if(aLength == 0) return b;
        else if(bLength == 0) return a;

        int[] t = new int[aLength + bLength];
        int i=0;
        int j=0;
        int k=0;

        while(i < aLength && j < bLength) {
            if(a[i] < b[j]) t[k++] = a[i++];
            else t[k++] = b[j++];
        }

        while(i < aLength) {
            t[k++] = a[i++];
        }

        while(j < bLength) {
            t[k++] = b[j++];
        }
        
        return t;

    }
    
}
