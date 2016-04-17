import java.util.HashMap;
import java.util.Stack;

/**
 * Created by YGZ on 2016/2/23.
 */
public class ValidParentheses {
    public boolean isValid(String s) {
        if (s.length()==0||s.length()%2==1||s==null) return false;
        Stack<Character> stack = new Stack<Character>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='('||s.charAt(i)=='['||s.charAt(i)=='{'){
                stack.push(s.charAt(i));
            }else {
                if (stack.empty()){
                    return false;
                }else if (s.charAt(i) == ')'){
                    char x = stack.pop();
                    if (x!='(') return false;
                }else if (s.charAt(i) == '}'){
                    char x = stack.pop();
                    if (x!='{') return false;
                }else if (s.charAt(i) == ']'){
                    char x = stack.pop();
                    if (x!='[') return false;
                }else{
                    return false;
                }
            }
        }
        if (stack.empty()) {
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args){
        ValidParentheses validParentheses = new ValidParentheses();
        String s = "()";
        System.out.println(validParentheses.isValid(s));
    }
}
