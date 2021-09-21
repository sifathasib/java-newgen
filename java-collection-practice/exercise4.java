import java.util.*;

public class exercise4 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("hasib");
        list.add("sifat");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
