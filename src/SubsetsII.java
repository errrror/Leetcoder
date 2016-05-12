import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by ygz on 16/5/1.
 * My email : errrrorer@foxmail.com
 */
public class SubsetsII {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        res.add(new ArrayList<Integer>());
        int begin = 0;
        for (int i=0;i<nums.length;i++){
            if (i==0||nums[i]!=nums[i-1]) begin = 0;
            int size = res.size();
            for (int j=begin;j<size;j++){
                List<Integer> cur = new ArrayList<Integer>(res.get(j));
                cur.add(nums[i]);
                res.add(cur);
            }
            begin = size;
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {1,1,2,2};
        SubsetsII subsetsII = new SubsetsII();
        System.out.print(subsetsII.subsetsWithDup(nums).toString());
    }
}
