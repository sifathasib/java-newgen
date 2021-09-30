import java.util.Date;
import java.text.SimpleDateFormat; 
public class SimpleDateFormatExample {
    public static void main(String args[]){
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        String strDate = formatter.format(date);
        System.out.println("current Date is: "+date);
        System.out.println("after Formating : "+strDate);

        formatter = new SimpleDateFormat("MMMM dd,yyyy hh:mm:ss");
        strDate = formatter.format(date);
        System.out.println("after Formating : "+strDate);


    }
}
