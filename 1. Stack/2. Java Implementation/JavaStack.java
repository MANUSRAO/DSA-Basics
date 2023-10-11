import java.util.*;
public class JavaStack{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<Integer>();
        // Pushing
        st.push(12);
        st.push(13);
        st.push(14);
        // Popping
        System.out.println(st.pop());
        // Peek
        System.out.println(st.peek());
        // is Empty
        System.out.println(st.empty());
        // searching
        System.out.println(st.search(12));
    }
}