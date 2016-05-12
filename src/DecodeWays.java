/**
 * Created by YGZ on 2016/5/9.
 * My email : gzyang1125@foxmail.com
 */
public class DecodeWays {
    public int numDecodings(String s) {
        if (s==null||s.length()==0) return 0;
        if (s.charAt(0)=='0') return 0;
        if (s.length()==1&&s.charAt(0)!='0') return 1;
        int n1=1,n2=1;
        int tem;
        for (int i=2;i<=s.length();i++){
            int res = 0;
            tem = s.charAt(i-1)-'0';
            if (tem!=0){
                 res = n2;
            }
            tem = Integer.parseInt(s.substring(i-2,i));
            if (s.charAt(i-2)!='0'&&(tem>=1&&tem<27)){
                res+=n1;
            }
            n1 = n2;
            n2 = res;
        }
        return n2;
    }
    public static void main(String[] args){
        String s = "1010";
        DecodeWays decodeWays = new DecodeWays();
        System.out.print(decodeWays.numDecodings(s));
    }
}
