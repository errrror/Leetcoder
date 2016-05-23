import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by YGZ on 2016/5/23.
 * My email : gzyang1125@foxmail.com
 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        for (int i=0;i<numRows;i++){
            res.add(helper(i));
        }
        return res;
    }

    public List<Integer> helper(int n) {
        List<Integer> res = new ArrayList<Integer>();
        if (n==0) {
            res.add(1);
            return res;
        }
        res.add(1);
        double result = 1;
        for (int i=1,j=n;i<=n/2;){
            result = result/i*j;
            res.add((int)result);
            i++;
            j--;
        }
        int j=0;
        if (n%2==1){
            j = n/2;
        }else {
            j = n/2-1;
        }
        for (;j>=0;j--){
            res.add(res.get(j));
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 5;
        PascalsTriangle p = new PascalsTriangle();
        System.out.println(p.generate(n));
    }
}
