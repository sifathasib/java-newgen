import java.util.*;

public class ListSet {
    public static void main(String[] args){
        Random random = new Random();
        List<Integer> list = new ArrayList<Integer>();
        Set<Integer> set = new HashSet<Integer>();
        for(int i =1;i<=10;i++){
            list.add(random.nextInt(100));
        }
        Collections.sort(list);
        for(int i : list){
            System.out.print(i+" ");
        }
        System.out.println();
        set.addAll(list);
        for(int i:set){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
