import java.io.*;

public class FileDemo {
    public static void main(String args[]){
        try {
            File f = new File("javafile.txt");
            if (f.createNewFile()) {
                System.out.println("file is created");
            } else {
                System.out.println("file is not created");
            }
        } catch (IOException e) {
            //TODO: handle exception
            e.printStackTrace();
        }
    }    
}
