import java.util.ArrayList;
import java.util.List;

/**
 * Created by YGZ on 2016/5/26.
 * My email : gzyang1125@foxmail.com
 */
public class PalindromePartitioning {
    public List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<List<String>>();
        if (s == null||s.length()==0) return res;
        List<String> list = new ArrayList<String>();
        helper(res,list,0,s);
        return res;
    }
    public void helper(List<List<String>> res,List<String> list,int start,String s){
        if (start==s.length()) {
            res.add(new ArrayList<String>(list));
            return;
        }
        String tem ;
        for(int i=0;i<s.length()-start;i++){
            tem = s.substring(start,start+i+1);
            if (isPalindromeString(tem)){
                list.add(tem);
                helper(res,list,start+i+1,s);
                list.remove(list.size()-1);
            }
        }
    }
    public boolean isPalindromeString(String s){
        if (s==null||s.length()==0) return true;
        int i=0,j=s.length()-1;
        while (i<j){
            if (s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}
