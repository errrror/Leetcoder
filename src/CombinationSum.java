import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by YGZ on 2016/2/28.
 */
public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (candidates==null||candidates.length == 0) return result;
        Arrays.sort(candidates);
        ArrayList<Integer> cur = new ArrayList<Integer>();
        combine(candidates,target,0,cur,result);
        return result;
    }
    public static void combine(int[] candidates,int target,int j,ArrayList<Integer> cur,List<List<Integer>> result){
        if (target==0){
            ArrayList<Integer> tem = new ArrayList<Integer>(cur);
            result.add(tem);
            return;
        }
        for (int i=j;j<candidates.length;i++){
            if (target<candidates[i]) return;
            cur.add(candidates[i]);
            combine(candidates, target - candidates[i], i, cur, result);
            cur.remove(cur.size()-1);
        }
    }
}
