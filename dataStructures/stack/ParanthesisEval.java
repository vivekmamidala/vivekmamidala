package dataStructures.stack;

import java.util.HashMap;
import java.util.Map;
import java.util.Map;
import java.util.Stack;

public class ParanthesisEval {
    Stack<Character> st;
    public ParanthesisEval(){
        st = new Stack<Character>();
    }

    public boolean isValid(String s) {
        Map<Character, Character> m = new HashMap<Character, Character>();
        m.put('}', '{');
        m.put(')', '(');
        m.put(']', '[');
        for(char c : s.toCharArray()) {
            if(m.keySet().contains(c) && m.get(c).equals(st.peek())) {
                st.pop();
            }
        }
        return st.isEmpty();
    }
}