package dataStructures.misc;

import java.util.HashSet;

public class FirstRecChar {
    public static void main(String[] args) {
        System.out.println(findFirstRecChar("dfssad"));
    }

    private static char findFirstRecChar(String st) {
        Character k = null;
        HashSet<Character> set = new HashSet<>();
        //String st = String.valueOf(c);
        for(char c : st.toCharArray()) {
            if(!set.add(c)) return c;
        }
        return k;
    }
}
