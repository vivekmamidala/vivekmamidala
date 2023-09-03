package dataStructures.array;

public class MyStringExec {
    public static void main(String[] args) {
        MyString m = new MyString("fsd");
        System.out.println(m.length());
        System.out.println(m.charAt(2));
        System.out.println(m.subString(1, 2));
        System.out.println(m.reverse().toString());
    }
}
