
import java.util.*;

public class Linkedlisttest {
    public static void main(String[] args){
        List <Book> ls = new LinkedList<Book>();

        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);  
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);  
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6); 

        ls.add(b1);
        ls.add(b2);
        ls.add(b3);

        /*for(Book b:ls){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }*/

        Iterator<Book> itr = ls.iterator();
        while(itr.hasNext()){
            Book b = itr.next();
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }


    }
}
