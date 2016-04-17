import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by YGZ on 2016/2/24.
 */
public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        if (n == 0) return res;
        helper(res,"",n,n);
        return res;
    }
    public void helper(List<String> res,String s,int left,int right){
        if (right == 0){
            res.add(s);
        }
        if (left>0){
            helper(res,s+'(',left-1,right);
        }
        if (right>left){
            helper(res,s+')',left,right-1);
        }
    }
    public static void main(String[] args){
        GenerateParentheses generateParentheses = new GenerateParentheses();
        generateParentheses.generateParenthesis(3);
    }
}
