import java.util.*;

public class exercise2 {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("Red");
        list.add("green");
        list.add("orange");
        list.add("black");
        System.out.println(list);
        System.out.println("After ading first");
        list.add(0,"pink");
        list.add(4,"pink LAST");
        System.out.println(list);
    }
}
