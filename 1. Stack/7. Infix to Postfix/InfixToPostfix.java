import java.util.*;
public class InfixToPostfix {
    public static void main(String[] args) {
        String exp = "a+b*(c^d-e)^(f+g*h)-i";
        System.out.println(infixToPostfix(exp));
    }

    public static String infixToPostfix(String infix){
        String res="";
        Stack<Character> st = new Stack<Character>();
        for(int i=0;i<infix.length();i++){
            char now = infix.charAt(i);
            if(Character.isLetterOrDigit(now))
                res+=now;
            else{
                if(now=='('){
                    st.push(now);
                }
                else if(now==')'){
                    while(!st.isEmpty() && st.peek()!='('){
                        res+=st.pop();
                    }
                    st.pop();
                }
                else{
                    while(!st.isEmpty() && prec(now)<=prec(st.peek())){
                        res+=st.pop();
                    }
                    st.push(now);
                }
            }
        }
        while (!st.isEmpty()) {
            if (st.peek() == '(')
                return "Invalid Expression";
            res += st.peek();
            st.pop();
        }
        return res;
    }

    public static int prec(char sym){
        if(sym=='^')
            return 6;
        else if(sym=='/' || sym=='*' || sym=='%')
            return 5;
        else if(sym=='+' || sym=='-')
            return 4;
        return 0;
    }

    public static boolean isAlpha(char sym){
        if("ABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(sym+""))
            return true;
        return false;
    }
}