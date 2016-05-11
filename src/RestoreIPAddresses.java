import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by YGZ on 2016/5/10.
 * My email : gzyang1125@foxmail.com
 */
public class RestoreIPAddresses {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<String>();
        if (s.length()<=3||s.length()>12) return res;
        String s1="";
        isValid(res,s1,s,3);
        return res;
    }
    public static void isValid(List<String> res,String result,String s,int point){
        if (s.length()<(point+1)||s.length()>3*(point+1)) return;
        if (s.charAt(0)=='0') {
            if (point==0&&s.length()!=1) return;
            if (point!=3){result+='.';}
            result+='0';
            if (point==0){
                res.add(result);
                return;
            }
            isValid(res,result,s.substring(1,s.length()),point-1);
            return;
        }
        if (point==0){
            if (Integer.parseInt(s)>=256) return ;
            if (Integer.parseInt(s)<256) {
                result+='.';
                result+=s;
                res.add(result);
                return;
            }
        }
        for (int i=1;i<=3;i++){
            if (i>s.length()) return;
            String s1 = s.substring(0,i);
            if (Integer.parseInt(s1)<256){
                String tem = result;
                if (point!=3){result+='.';}
                result+=s1;
                isValid(res,result,s.substring(i,s.length()),point-1);
                result = tem;
            }else continue;
        }
    }
    public static void main(String[] args){
        //String s = "25525511135";
        String s= "1111";
        RestoreIPAddresses restoreIPAddresses = new RestoreIPAddresses();
        System.out.println(restoreIPAddresses.restoreIpAddresses(s));
    }
}
