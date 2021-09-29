import java.util.*;
import java.util.Random;

public class HashMapTest {
    public static void main(String[]args){
        Random random = new Random();
        HashMap<Integer,String> map = new HashMap<Integer,String>();
        map.put(random.nextInt(10),"apple");
        map.put(random.nextInt(10),"mango");
        map.put(random.nextInt(10),"grpaes");
        map.put(random.nextInt(10),"banana");
        for(Map.Entry<Integer,String> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
        map.putIfAbsent(5, "this was absent");
        map.putIfAbsent(8, "this was absent");
        for(Map.Entry<Integer,String> m : map.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }  
}
