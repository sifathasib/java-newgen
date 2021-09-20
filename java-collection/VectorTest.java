import java.util.*;

public class VectorTest {
    public static void main(String[] args){
        Vector<String> str = new Vector<String>();
        str.add("Hello");
        str.add("sifat");
        str.add("How r u");
        str.add("How r u");
        Iterator<String> itr = str.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());     

        }


    }
}


