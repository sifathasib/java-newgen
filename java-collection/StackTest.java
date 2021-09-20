import java.util.*;
public class StackTest {
    public static void main(String[] args){
        Stack<String> st = new Stack<String>();
        st.push("sifat");
        st.push("hello");
        st.push("what's up");
        st.push("hello");
        st.push("world");

        for (String s : st){
            System.out.println(s);
        }
        st.pop();
        System.out.println("after popping");
        for (String s : st){
            System.out.println(s);
        }
    }
}
