import java.util.*;
public class SetTest {
    public static void main(String[] args){
        Set<String> setA = new HashSet<String>();
        setA.add("Element 1");
        setA.add("Element 2");
        setA.add("Element 3");
        setA.add("Element 4");

        for(String s: setA){
            System.out.println(s);
        }
    }
}
