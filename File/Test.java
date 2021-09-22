import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args){
        
        try {
            FileOutputStream fout = new FileOutputStream("test.txt");
            String s ="Hello world! sifat";
            byte b[]= s.getBytes();
            fout.write(b);
            fout.close();
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
    }
}
