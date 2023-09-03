package dataStructures.misc;

public class Solution {
    
    public static void main(String args[]) {
        int[] prices = new int[]{1,2};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int minv = Integer.MAX_VALUE;
        int maxp = 0;
    int curp = 0;
        for(int i=0; i < prices.length ; i++) {
            if(minv > prices[i]) {
                minv = prices[i];
            }
            curp =  prices[i] - minv ;                                               
                                 if(curp > maxp)  maxp = curp;
                                 }

        return maxp;
    }
}
