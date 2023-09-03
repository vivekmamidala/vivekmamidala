
package dataStructures.stack;

import java.util.Stack;

import dataStructures.stack.*;
public class ExpEval {
    public int evalRPN(String[] tokens) {
        Stack<String> st = new Stack();
        for(String s: tokens) {
            if(!isAOp(s)) st.push(s);
            else {
                Integer a = Integer.parseInt(st.pop());
                Integer b = Integer.parseInt(st.pop());
                st.push(performOp(b, a, s).toString());
            }
        }
        return Integer.parseInt(st.pop());
    }
    
    private boolean isAOp(String s) {
        if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")) return true;
        return false;
    }
    
    private Integer performOp(Integer a, Integer b, String op) {
        switch(op) {
            case "+" : return a + b;
            case "*" : return a * b;
            case "-" : return a-b;
            case "/" : return a/b;
        }
        return 0;
    }

    public static void main(String[] args) {
        ExpEval e = new ExpEval();
        System.out.println(13/5);
        System.out.println(e.evalRPN(new String[]{"4","13","5","/","+"}));
    }
}