package dataStructures.array;

import java.util.Arrays;

public class MyString {
    private char[] values;
    private int length;

    public MyString() {

    }

    public MyString(char[] letters) {
        this.values = letters;
        this.length = letters.length;
    }

    public MyString(String st) {
        this.values = st.toCharArray();
        this.length = st.length();
    }

    public int length() {
       return this.length;
    }

    public char charAt(int index) {
        if(index < 0 || index >= length) throw new IndexOutOfBoundsException(index);
        return values[index];
    }

    public MyString subString(int srt, int end) {
        if(srt < 0 || srt >= length || end < 0 || end >= length || srt > end) {
            throw new IndexOutOfBoundsException();
        }
        
        char[] newValues = new char[end-srt];
        MyString newString = new MyString(newValues);
        int i=0;
        while(end != srt) {
            newValues[i++] = values[srt++];
        }
          return newString;  
    } 

    public MyString reverse() {
        int len = length;
        char[] revChar = new char[len];
        MyString revString = new MyString(revChar);
        int i = 0;
        while(len-- > 0) {
            revChar[i++] = values[len];
        }
        return revString;

    }

    public String toString() {
       // for(char c : values) {
       //     System.out.print(c);
       // }
        return new String(values);
    }

}
