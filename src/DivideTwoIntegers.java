/**
 * Created by YGZ on 2016/2/24.
 */
public class DivideTwoIntegers {
    public int divide(int dividend, int divisor) {
        if (divisor==0||(dividend==Integer.MIN_VALUE&&divisor==-1)) return Integer.MAX_VALUE;
        if (dividend == Integer.MIN_VALUE && divisor == 1) return Integer.MIN_VALUE;
        int sign = 1;
        if (dividend<0) sign = -sign;
        if (divisor<0) sign = -sign;
        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long c = b;
        int tmp = 1;
        while(a>=c<<1){
            c = c << 1;
            tmp = tmp << 1;
        }
        int res = 0;
        while (a>b){
            if (a>c) {
                res += tmp;
                a -= c;
            }else {
                tmp = tmp>>1;
                c=c>>1;
            }
        }
        if (a==b){
            res += 1;
        }
        return sign>0?res:-res;
    }
    public static void main(String[] args){
        DivideTwoIntegers divideTwoIntegers = new DivideTwoIntegers();
        int i = divideTwoIntegers.divide(4,2);
        System.out.println(i);
    }
}
