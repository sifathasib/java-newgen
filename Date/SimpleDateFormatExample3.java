import java.util.Date; 
import java.text.SimpleDateFormat; 
import java.text.ParseException; 

public class SimpleDateFormatExample3{
    public static void main(String args[]){
        SimpleDateFormat formater = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date date = formater.parse("31/12/1994");
            System.out.println();
        } catch (ParseException e) {
            
            System.out.println(e);
        }

    }
}