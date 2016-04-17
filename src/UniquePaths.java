/**
 * Created by YGZ on 2016/3/14.
 */
public class UniquePaths {
    /*public int uniquePaths(int m, int n) {
        if (m<=0||n<=0) return 0;
        return helper(m,n);
    }
    public int helper(int m,int n){
        if (m==1||n==1) return 1;
        if (m==2&&n==2) return 2;
        return helper(m-1,n)+helper(m,n-1);
    }*/
    public int uniquePaths(int m, int n) {
        int smaller = m>n ? n-1 : m-1;
        int totalsteps = m+n-2;
        long result = 1;
        for (int counter = 1; counter<=smaller; counter++){
            result *= totalsteps--;
            result /= counter;
        }
        return (int)result;
    }
    public static void main(String args[]){
        UniquePaths uniquePaths = new UniquePaths();
        System.out.println(uniquePaths.uniquePaths(5,4));
    }
}
