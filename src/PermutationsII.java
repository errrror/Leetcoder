import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by YGZ on 2016/3/1.
 */
public class PermutationsII {
    private List<List<Integer>> res = new ArrayList<List<Integer>>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums.length<1 || nums==null) return res;
        List<Integer> cur = new ArrayList<Integer>();
        Arrays.sort(nums);
        int len = nums.length;
        for (int i=0;i<len;i++){
            cur.add(nums[i]);
        }
        helper(cur,0,len,res);
        return res;
    }
    public static void swap(List<Integer> num,int i,int j){
        int tem = num.get(i);
        num.set(i,num.get(j));
        num.set(j,tem);
    }
    public static void helper(List<Integer> num,int start,int len,List<List<Integer>> res){
        if (start == len-1){
            res.add(new ArrayList<Integer>(num));
            return;
        }
            /*int i = start;
            while(i<len-1&&num.get(i)==num.get(i+1)){
                i++;
            }*/
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i=start;i<len;i++){
            if (set.add(num.get(i))) {
                swap(num, start, i);
                helper(num, start + 1, len, res);
                swap(num, start, i);
            }
        }
    }
    public static void main(String args[]){
        PermutationsII permutationsII = new PermutationsII();
        int[] num = {1,1,2};
        List<List<Integer>> result =new ArrayList<List<Integer>>();
        result = permutationsII.permuteUnique(num);
        System.out.println(result);
    }
}
