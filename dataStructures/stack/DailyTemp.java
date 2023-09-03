package dataStructures.stack;

import java.util.Stack;
/**
 * vmamidala
 * Problem statement- the temperature of each day are sent in array. 
 * return  an array containting how many day it took to increase the temperature from current day. 
 * if temperate does not increase return -1 for htat day.
 * 
 * Solution - we loop through the input array, 
 * whenever current temperature is more than top of stack, difference of indexes is stored in result. iterate through stack to find theier result.
 * whenever stack is empty or current temperature is not more than top of the stack, we insert index of the current element. 
 */
public class DailyTemp {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<Integer>();
        int len = temperatures.length;
        int[] res = new int[len];
        for(int i=0; i<len; i++) {
            if(st.isEmpty() || temperatures[st.peek()] >= temperatures[i]) {
                st.push(i);
            } else {
                while(!st.isEmpty() && temperatures[st.peek()] < temperatures[i]) {
                    res[st.peek()] = i-st.peek();
                    st.pop();
                }
                st.push(i);
            
        }
        }

        return res;

    }

    public static int[] dailyTemperatures1(int[] temperatures) {
        int len = temperatures.length;
        int[] res = new int[len];
        int hottest = temperatures[len-1];
        System.out.println("in method");
        for(int currentDay=len-2; currentDay >= 0; currentDay--) {
            if(hottest != 0 && hottest < temperatures[currentDay]) {
                hottest = temperatures[currentDay];
                continue;
            } 
            if(temperatures[currentDay] < temperatures[currentDay+1]) {
                res[currentDay] = 1;
                //hottest = temperatures[currentDay+1];
                continue;
            }
                //int j = i;
                int days = 1;
                while(temperatures[currentDay + days] <= temperatures[currentDay]) {
                    if(res[currentDay + days] == 0) {
                       continue;
                    }
                    days  += res[currentDay + days];
                }
                res[currentDay] = days;
        }
        return res;

    }

    public static void main(String[] args) {
        //int[] t = new int[]{73,74,75,71,69,72,76,73};
        int[] t = new int[]{34,80,80,34,34,80,80,80,80,34};
        for(int i :dailyTemperatures1(t)) {
            System.out.println(i);
        }
    }
}