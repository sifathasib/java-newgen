import java.lang.Thread;
import java.util.concurrent.ThreadLocalRandom;
import java.lang.Runnable;

public class TestCallRun implements Runnable{
    public void run(){
        for(int i=0; i<=5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(i);
        }
    }
    public static void main(String args[]){
        TestCallRun tcr1 = new    TestCallRun();
        TestCallRun tcr2 = new    TestCallRun();

        Thread t1  = new Thread(tcr1);
        Thread t2  = new Thread(tcr2);

        t1.start();
        t2.start();

        
    }
}