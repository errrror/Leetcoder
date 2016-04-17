/**
 * Created by YGZ on 2016/2/26.
 */
public class CountandSay {
    public String countAndSay(int n) {
        if (n<1) return null;
        if (n==1) return "1";
        String tem = countAndSay(n-1);
        String res = "";
        int i = 0;
        int j = i;
        int length = tem.length();
        char[] arr = tem.toCharArray();
        while(j<length) {
            if (arr[i]==arr[j]){
                j++;
            }else {
                res += j - i;
                res += arr[i];
                i = j;
            }
        }
        if (arr[i]==arr[j-1]){
            res += j-i;
            res += arr[i];
        }
        return res;
    }
    public static void main(String args[]){
        CountandSay countandsay = new CountandSay();
        String res = countandsay.countAndSay(5);
        System.out.println(res);
    }
}
