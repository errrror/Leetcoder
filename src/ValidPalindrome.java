/**
 * Created by YGZ on 2016/5/27.
 * My email : gzyang1125@foxmail.com
 */
public class ValidPalindrome {
    /*
    * 判断一个字符是不是数字和字母，Character.isLetterOrDigit()这个方法可以判断，不用各种计算ASCII
    * */
    public boolean isPalindrome(String s) {
        if(s==null||s.length()==0) return true;
        int i=0,j=s.length()-1;
        while (i<s.length()&&!((s.charAt(i) <= 'z' && s.charAt(i) >= 'a') || (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A')||(s.charAt(i)<='9'&&s.charAt(i)>='0')))
            {i++;}
        while (j>=0&&!((s.charAt(j) <= 'z' && s.charAt(j) >= 'a') || (s.charAt(j) <= 'Z' && s.charAt(j) >= 'A')||(s.charAt(j)<='9'&&s.charAt(j)>='0')))
            {j--;}
        while(i<j){
            if (Math.abs(s.charAt(i)-s.charAt(j))==32&&(s.charAt(i)<='9'||s.charAt(j)<='9')) return false;
            if(!(s.charAt(i)-s.charAt(j)==0||Math.abs(s.charAt(i)-s.charAt(j))==32)) return false;
            i++;
            j--;
            while (i<s.length()&&!((s.charAt(i) <= 'z' && s.charAt(i) >= 'a') || (s.charAt(i) <= 'Z' && s.charAt(i) >= 'A')||(s.charAt(i)<='9'&&s.charAt(i)>='0')))
            {i++;}
            while (j>=0&&!((s.charAt(j) <= 'z' && s.charAt(j) >= 'a') || (s.charAt(j) <= 'Z' && s.charAt(j) >= 'A')||(s.charAt(j)<='9'&&s.charAt(j)>='0')))
            {j--;}
        }
        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "ab2a";
        System.out.println(validPalindrome.isPalindrome(s));
    }
}
