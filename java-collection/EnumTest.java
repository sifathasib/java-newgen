import java.util.Vector;
import java.util.Enumeration;

public class EnumTest {
    public static void main(String args[]){
        Vector<Integer> vec = new Vector<Integer>();
        for(int i =1;i<10;i++){
            vec.addElement(i);
        }
        Enumeration e = vec.elements();
        while(e.hasMoreElements()){
            int i = (Integer)e.nextElement();
            System.out.println(i+" ");
        }
    }
}
