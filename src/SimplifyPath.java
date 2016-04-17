import java.util.Stack;

/**
 * Created by YGZ on 2016/3/24.
 */
public class SimplifyPath {
    public String simplifyPath(String path) {
        String[] tem = path.split("/");
        String[] stack = new String[tem.length];
        int str = 0;
        for (int i=0;i<tem.length;i++){
            if (tem[i].equals("")||tem[i].equals(".")){
                continue;
            }else if (tem[i].equals("..")){
                if (str>0) str--;
            }else{
                stack[str] = tem[i];
                str++;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i=0;i<str;i++){
            res.append("/");
            res.append(stack[i]);
        }
        return res.length()==0?"/":res.toString();
    }
    public static void main(String args[]){
        SimplifyPath simplifyPath = new SimplifyPath();
        String s = "/.";
        System.out.println(simplifyPath.simplifyPath(s));
    }
}
