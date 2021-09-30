import java.util.Date; 
import java.text.DateFormat;
public class DateFormatExcample {
    public static void main(String args[]){
        Date currentDate = new Date();
        System.out.println("Current Date: "+currentDate);

        String dateToString = DateFormat.getInstance().format(currentDate);
        System.out.println("Date format using getInstance method: "+ dateToString);

        String onlyDatetoString = DateFormat.getDateInstance().format(currentDate);
        System.out.println("Date fomrat using getDateInstance method: "+onlyDatetoString);

        String onlyTimeToString = DateFormat.getTimeInstance().format(currentDate);
        System.out.println("Date format using getTimneInstance method: "+onlyTimeToString);
    }
}
