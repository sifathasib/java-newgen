import java.lang.Thread;
import java.lang.Runnable;
class A {
    public static void main(String[] args) {
        System.out.println("hello");    
    }
} 
     
class Test extends A{  
    public static void main(String args[]){  
        System.out.println("world"); 
   } 
} 
   