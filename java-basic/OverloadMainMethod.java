public class OverloadMainMethod {
    public void main(){
        System.out.println("no arugment main method overloaded");
    }
    public void main(int a, int b){
        System.out.println("int argument overloaded min method");
        System.out.println("sum is : "+(a+b));
    }
    public static void main(String[] args){
        OverloadMainMethod obj = new OverloadMainMethod();
        obj.main();
        obj.main(3, 5);
    }
}
