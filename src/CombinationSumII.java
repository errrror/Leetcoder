import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by YGZ on 2016/2/29.
 * My email : errrrorer@foxmail.com
 */
public class CombinationSumII {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (candidates==null||candidates.length==0) return result;
        ArrayList<Integer> cur = new ArrayList<Integer>();
        Arrays.sort(candidates);
        combine(candidates, target, 0, cur, result);
        return result;
    }
    public static void combine(int[] candidates,int target,int j,ArrayList<Integer> cur,List<List<Integer>> result){
        if (target==0){
            ArrayList<Integer> tem = new ArrayList<Integer>(cur);
            result.add(tem);
            return;
        }
        for (int i=j;i<candidates.length;i++){
            if (target<candidates[i]) return;
            cur.add(candidates[i]);
            combine(candidates,target-candidates[i],i+1,cur,result);
            cur.remove(cur.size()-1);
            while (i<candidates.length-1&&candidates[i] == candidates[i+1]) i+=1;
            //if (cur.isEmpty()) return;
        }
    }
    public static void main(String args[]){
        int[] nums = {1,1,1,1};
        CombinationSumII combinationSumII = new CombinationSumII();
        List<List<Integer>> result = combinationSumII.combinationSum2(nums, 2);
        System.out.println(result);
    }
}
