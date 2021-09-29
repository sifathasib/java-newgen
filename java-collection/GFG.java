import java.io.*;
import java.util.*;

public class GFG {
    public static <T> Collection<T> getCollectionFromIterable(Iterable<T> itr){
        Collection <T> cltn = new ArrayList<T>();
        for(T t : itr){
            cltn.add(t);
        }
        return cltn;
    }
    public static void main(String args[]){
        Iterable<Integer> itr = Arrays.asList(1,2,3,4,5);
        System.out.println(itr);
        Collection<Integer> ls = getCollectionFromIterable(itr);
        System.out.println(ls);
    }    
}
