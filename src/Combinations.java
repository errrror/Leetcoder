import java.util.ArrayList;
import java.util.List;

/**
 * Created by YGZ on 2016/3/29.
 */
public class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if (k>n) return null;
        helper(res,new ArrayList<Integer>(),n,k,1);
        return res;
    }
    private static void helper(List<List<Integer>> res,List<Integer> tem,int n,int num,int now){
        if (num==0) {
            res.add(new ArrayList<Integer>(tem));
            return;
        }
        if (now>n) return ;
        for (;now<=n;now++){
            tem.add(now);
            helper(res,tem,n,num-1,now+1);
            tem.remove(tem.size()-1);
        }
    }
    public static void main(String args[]){
        int n=4;
        int k=2;
        Combinations combinations = new Combinations();
        combinations.combine(n,k);
    }
}
