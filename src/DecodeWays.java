/**
 * Created by YGZ on 2016/5/9.
 * My email : gzyang1125@foxmail.com
 */
public class DecodeWays {
    public int numDecodings(String s) {
        if (s.length()==0) return 0;
        if (s.charAt(0)=='0') return 0;
        int n1,n2=2;
        if (s.charAt(0)=='0'){
            return 0;
        }else {
            n1=1;
            if (s.length()==1) return n1;
        }
        if (s.length()==2){
            if (s.charAt(0)=='0') return 0;
            if (Integer.parseInt(s)==10||Integer.parseInt(s)==20) return 1;
            if (Integer.parseInt(s)<=26) return 2;
        }
        if (Integer.parseInt(s.substring(0,2))==10||Integer.parseInt(s.substring(0,2))==20) {
            n2=1;
        }
        if (Integer.parseInt(s.substring(0,2))<=26){
            n2=2;
        }
        for (int i=0;i<s.length()-1;i++){
            if ()
            int tem = n1+n2;
            if (s.charAt(i)=='0') return 0;
            if (s.charAt())
            n1 = n2;
            n2 = tem;
        }
        return n2;
    }
    public static void main(String[] args){
        String s = "20";
        DecodeWays decodeWays = new DecodeWays();
        System.out.print(decodeWays.numDecodings(s));
    }
}
