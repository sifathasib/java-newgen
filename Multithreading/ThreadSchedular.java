import java.lang.Thread;

public class ThreadSchedular extends Thread {
    public void run(){
        for(int i =1;i<=5;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName()+" " +i);
        }
    }
    public static void main(String args[]){
        ThreadSchedular t1 = new ThreadSchedular();
        ThreadSchedular t2 = new ThreadSchedular();
        t1.start();
        t2.start();
    }
}
