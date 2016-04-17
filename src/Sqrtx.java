/**
 * Created by YGZ on 2016/3/18.
 */
public class Sqrtx {
    public int mySqrt(int x) {
        if (x<=1) return x;
        if (x >= 2147395600) return 46340;
        int a = 46340;
        int b = 0;
        while (b*b<x&&a*a>x){
            int mid = a - ((a-b)/2);
            if (mid*mid<x){
                b = mid;
            }else if (mid*mid>x){
                a = mid;
            }else {
                return mid;
            }
            if (a-b==1) return b;
        }
        return 0;
    }
    public static void main(String args[]){
        Sqrtx sqrtx = new Sqrtx();
        System.out.println(sqrtx.mySqrt(2147395599));
    }
}
