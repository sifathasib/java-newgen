import java.util.Date;
import java.text.DateFormat;

public class DateFormatTest {
    public static void main(String args[]){
        Date date = new Date();
        System.out.println("current Date: "+date);
        String dateToString = DateFormat.getDateInstance().format(date);
        String timeToString = DateFormat.getTimeInstance().format(date);
        System.out.println("Date format using getDateInstance method: "+dateToString);        
        System.out.println("Time format using getTimeInstance method: "+timeToString);        
    }
}
