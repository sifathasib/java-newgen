import java.sql.Date;
public class StringtoDate {
    public static void main(String args[]){
        String str = "1994-31-12";
        Date date = Date.valueOf(str);
        System.out.println(date);
    }
}
