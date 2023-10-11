import java.util.*;
// TC: O(N)
// SC: O(N)
public class PrefixToInfix{
    public static void main(String[] args){
        String exp = "*+AB-CD";
        System.out.println("Infix : " + converter(exp));
    }

    public static String converter(String prefix){
        int n = prefix.length();
        Stack<String> st = new Stack<String>();
        for(int i=n-1;i>=0;i--){
            char now = prefix.charAt(i);
            if(Character.isLetterOrDigit(now)){
                st.push(now+"");
            }
            else{
                String op1 = st.pop();
                String op2 = st.pop();
                String temp = "(" + op1 + now + op2 +")";
                st.push(temp);
            }
        }
        return st.pop();
    }
}