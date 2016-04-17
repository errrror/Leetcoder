/**
 * Created by YGZ on 2016/3/2.
 */
public class ReverseInteger {
    public int reverse(int x) {
        if(x==Integer.MIN_VALUE)
            return 0;
        int num = Math.abs(x);
        int res = 0;
        for (;num!=0;)
        {
            //if(res>(Integer.MAX_VALUE-num%10)/10)
                //return 0;
            res = res*10+num%10;
            num /= 10;
            if(2147483647-res<100000000&&res>Integer.MAX_VALUE/10&&num!=0) return 0;
        }
        return x>0?res:-res;
    }
    public static void main(String args[]){
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.print(reverseInteger.reverse(1534236469));
    }
}
