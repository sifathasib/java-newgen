class TestMultiPriority1 extends Thread{  
    public void run(){  
      System.out.println("running thread name is:"+Thread.currentThread().getName());  
      System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
     
     }  
    public static void main(String args[]){  
     TestMultiPriority1 m1=new TestMultiPriority1();  
     TestMultiPriority1 m2=new TestMultiPriority1();  
     m1.setPriority(10);  
     m2.setPriority(1);  
     m1.start();  
     m2.start();  
      
    }  
   }     