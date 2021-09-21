public class Test {
    public static void main(String[] args){
        try {
            int a = 25/0;
            System.out.println(a);
        } catch (ArithmeticException e) {
            //TODO: handle exception
            System.out.println(e);
        }finally{
            System.out.println("this always executed");
        }


    }    
}
