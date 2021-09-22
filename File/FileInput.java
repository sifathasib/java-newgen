import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileInput {
    public static void main(String args[]){
        try {
            FileInputStream fin = new FileInputStream("test.txt");
            for(int i =0;(i=fin.read())!=-1;i++){
                System.out.print((char)i);
            }
            System.out.println();
            fin.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
