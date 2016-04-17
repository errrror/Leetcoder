import java.util.ArrayList;
import java.util.List;

/**
 * Created by YGZ on 2016/2/29.
 */
public class Permutations {
    private List<List<Integer>> rst = new ArrayList<List<Integer>>();
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length < 1) return rst;
        int len = nums.length-1;
        List<Integer> num = new ArrayList<Integer>();
        for (int i = 0;i<=len;i++){
            num.add(nums[i]);
        }
        helper(num,0,len,rst);
        return rst;
    }
    public static void swap(List<Integer> num,int i,int j){
        int tem1 = num.get(i);
        int tem2 = num.get(j);
        num.set(j,tem1);
        num.set(i,tem2);
    }
    public static void helper(List<Integer> num,int start,int len,List<List<Integer>> rst){
        if (start == len){
            rst.add(new ArrayList<Integer>(num));
            return;
        }else{
            for (int i = start;i<=len;i++){
                swap(num,start,i);
                helper(num,start+1,len,rst);
                swap(num,start,i);
            }
        }
    }
    public static void main(String args[]){
        Permutations permutations = new Permutations();
        int[] nums = {1,2,3,4};
        List<List<Integer>> rst = permutations.permute(nums);
        System.out.println(rst);
    }
}
