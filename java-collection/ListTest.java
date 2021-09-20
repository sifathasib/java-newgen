import java.util.*;

public class ListTest {
    public static void main(String[] args){
        List<String> list = new ArrayList<String>();
        List<String> listDest = new ArrayList<String>();
        List<String> sublist = new ArrayList<String>();
        list.add("this is string 1");
        list.add("this is string 2");
        list.add("this is string 3");
        list.add("this is string 4");

        listDest.addAll(list);
        listDest.add(1,"hello sifat");
        listDest.add(0,null);
        listDest.remove(3);
        for(String s : listDest){
            System.out.println(s);
        }
        System.out.println(list.size());
        System.out.println(listDest.size());
        sublist.addAll(list.subList(0, 3));
        for(String s: sublist){
            System.out.println(s);
        }

    }
    

}
