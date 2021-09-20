public class Singleton {
    private static Singleton instance = null;
    public String str;
    private Singleton(){
        
    }
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
    public static void main(String[] args){
        Singleton obj1 = Singleton.getInstance();
        obj1.str = "this is is first reference";
        Singleton obj2 = Singleton.getInstance();
        obj2.str = "this is second";
        System.out.println("first ref: "+obj1.str);
        System.out.println("first ref: "+obj2.str);
        
    }
}
