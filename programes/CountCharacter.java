public class CountCharacter {
    public static void main(String args []){
        int count = 0;
        String str = "This is the best of both worlds!";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                count++;
            }
        }
        System.out.println("Number of character: "+count);
    }
    
}
