import java.util.Date; 

public class DateCompareExample {
    public static void main(String args[]){
        Date d1 = new Date(97,10,17);
        Date d2 = new Date(98,11,11);

        int comparision = d1.compareTo(d2);
        int comparision1 = d2.compareTo(d1);
        int comparision2 = d1.compareTo(d1);
        System.out.println("d1 < d2: "+comparision);
        System.out.println("d2 > d1: "+comparision1);
        System.out.println("d1 = d1: "+comparision2);



    }    
}
