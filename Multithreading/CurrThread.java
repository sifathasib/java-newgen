import java.lang.Thread;
import java.lang.Runnable;
public class CurrThread implements Runnable {
    public void run(){
        for(int i= 1 ; i<=5;i++){
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(i + " Thread name: "+Thread.currentThread().getName());
        }    
    }
    public static void main(String args[]){
        Thread t1 = new Thread(new CurrThread());
        Thread t2 = new Thread(new CurrThread());
        Thread t3 = new Thread(new CurrThread());
        t1.setName("first");
        t2.setName("second");
        t3.setName("third");
        t1.start();
        
        try {
            t1.join(1500);
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
        }
        t2.start();
        t3.start();
    }
    
}
