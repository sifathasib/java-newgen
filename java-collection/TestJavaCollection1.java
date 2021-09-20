import java.util.ArrayList;
import java.util.Iterator;

class TestJavaCollection1{
    

    public static void main(String[] args){
        ArrayList <String> list = new ArrayList<String>();
        list.add("hello");
        list.add("world");
        list.add("sifat");
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}