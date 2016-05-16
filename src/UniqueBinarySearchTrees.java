/**
 * Created by YGZ on 2016/5/11.
 * My email : gzyang1125@foxmail.com
 */
public class UniqueBinarySearchTrees {
    public int numTrees(int n) {
        return helper(1,n);
        /*int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        for (int i=2;i<=n;i++){
            for (int j=0;j<i;j++){
                dp[i] += dp[j]*dp[i-j-1];
            }
        }
        return dp[n];*/
    }

    public static  int helper(int from, int to) {
        if (from>to) return 0;
        if (from==to) return 1;
        int res=0;
        int flag = (from+to)/2;
        flag++;
        int[] tem=new int[flag-from];
        int j=0;
        for (int i = from; i < flag; i++) {
            if (i == from) {
                tem[j] += helper(i + 1, to);
            } else if (i == to) {
                tem[j] += helper(from, to - 1);
            } else {
                tem[j] += helper(from, i - 1) * helper(i + 1, to);
            }
            j++;
        }
        if ((to-from)%2==0){
            for (int i = 0; i < tem.length-1 ; i++) {
                res+= 2 * tem[i];
            }
        }else {
            for (int i = 0; i < tem.length ; i++) {
                res+= 2 * tem[i];
            }
            return res;
        }
        res+=tem[tem.length-1];
        return res;
    }
    public static void main(String[] args){
        UniqueBinarySearchTrees uniqueBinarySearchTrees = new UniqueBinarySearchTrees();
        System.out.println(uniqueBinarySearchTrees.numTrees(5));
    }
}
