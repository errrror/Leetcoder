import java.util.ArrayList;
import java.util.List;

/**
 * Created by YGZ on 2016/5/26.
 * My email : gzyang1125@foxmail.com
 */
public class LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<String>();
        if (digits==null||digits.length()==0) return res;
        String[] strings ={"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        StringBuffer s = new StringBuffer();
        helper(res,s,0,digits,strings);
        return res;
    }
    public static void helper(List<String> res,StringBuffer s,int tag,String digits,String[] strings){
        if (tag==digits.length()){
            res.add(s.toString());
            return;
        }
        String tem = strings[digits.charAt(tag)-'2'];
        for (int i=0;i<tem.length();i++){
            s.append(tem.charAt(i));
            helper(res,s,tag+1,digits,strings);
            s.deleteCharAt(s.length()-1);
        }
    }
}
