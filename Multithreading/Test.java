import java.lang.Runnable;
import java.lang.Thread;
class Test implements Runnable {
    public void run(){
        System.out.println("thread is running");
    }
    public static void main(String[] args){
        Test test = new Test();
        Thread th = new Thread(test);
        th.run();
    }
}
