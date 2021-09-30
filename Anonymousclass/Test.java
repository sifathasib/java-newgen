abstract class Person{
    abstract void eat();
}
public class Test {
    public static void main(String args[]){
        Person p = new Person(){
            void eat(){
                System.out.println("Person eat fruite");
            }
        };
        p.eat();
    }
}
