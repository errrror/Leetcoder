import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by YGZ on 2016/3/29.
 */
public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length<=0) return null;
        int k = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        List<Integer> nu = new ArrayList<Integer>();
        res.add(nu);
        for (int i=1;i<=k;i++){
            helper(nums,res,new ArrayList<Integer>(),i,0);
        }
        return res;
    }
    private static void helper(int[] num,List<List<Integer>> res,List<Integer> tem,int len,int now){
        if (len==0){
            res.add(new ArrayList<Integer>(tem));
            return ;
        }
        if (now>num.length-1) return;
        for (;now<=num.length-1;now++){
            tem.add(num[now]);
            helper(num,res,tem,len-1,now+1);
            tem.remove(tem.size()-1);
        }
    }
}
