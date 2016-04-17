/**
 * Created by YGZ on 2016/3/17.
 */
public class PlusOne {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if (len == 0) return null;
        digits[len-1] += 1;
        int lag = len-1;
        while(digits[lag]==10&&lag>0){
            digits[lag] = 0;
            digits[lag-1] += 1;
            lag--;
        }
        if (digits[0]==10){
            digits[0] = 0;
            int[] res = new int[len+1];
            res[0] = 1;
            for (int i=0;i<len;i++){
                res[i+1] = digits[i];
            }
            return res;
        }
        return digits;
    }
    public static void main(String args[]){
        int[] a = {9,9};
        PlusOne plusOne = new PlusOne();
        int[] res = plusOne.plusOne(a);
        for (int i=0;i<res.length;i++) {
            System.out.print(res[i]+" ");
        }
    }
}
