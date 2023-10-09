import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
        input.add("4");
        input.add("5");
        input.add("3");
        input.add("dfd");
        input.add("2");
        input.add("8");
        System.out.println(evenNumbersSorted(input));
    }

    //return even numbers. soreted
    private static List<Integer>  evenNumbersSorted(List<String> values) {
        List<Integer> ret = new ArrayList<Integer>();
        for(String st : values) {
           try{
                int val = Integer.parseInt(st);
                if(val % 2 == 0) {
                    ret.add(val);
                }
           } catch(Exception e) {

           }
        }
        ret.sort((a1,a2) -> a1.compareTo(a2));
        return ret;
    }
}
