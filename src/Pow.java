/**
 * Created by YGZ on 2016/3/8.
 */
public class Pow {
    public double myPow(double x, int n) {
        if(n==0) return 1;
        double res = 1.0;
        if (n == Integer.MIN_VALUE){
            n = -n;
            x = 1/x;
            res *= x;
            n = Integer.MAX_VALUE;
        }
        if (n<0){
            n = -n;
            x = 1/x;
        }
        while(n!=0){
            if (n%2==1){
                res *= x;
            }
            x = x*x;
            n = n/2;
        }
        return res;
    }
    public static void main(String args[]){
        Pow pow = new Pow();
        double x = 2.2;
        int n = -3;
        System.out.println(pow.myPow(x,n));
    }
}
