import java.util.Date;
import java.text.DateFormat;
public class DateFormatExample2 {
    public static void main(String args[])throws Exception{
        //String source = "31 Dec, 1994";
        Date date = DateFormat.getDateInstance().parse("31 Mar,2015");
        System.out.println("Date: "+date);
    }    
}
