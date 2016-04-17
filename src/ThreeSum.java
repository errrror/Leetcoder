import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by YGZ on 2016/2/22.
 */
public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (nums == null) return null;
        if (nums.length<3) return result;
        Arrays.sort(nums);
        int i = 0;
        while (nums[i]<=0 && i<nums.length-2){
            if (nums[i]==0&&nums[i+2]==0){
                List<Integer> zero = new ArrayList<Integer>();
                zero.add(0);
                zero.add(0);
                zero.add(0);
                result.add(zero);
                break;
            }
            int begin = i+1;
            int end = nums.length-1;
            while(begin<end) {
                if (nums[i] + nums[begin] + nums[end] == 0) {
                    List<Integer> example = new ArrayList<Integer>();
                    example.add(nums[i]);
                    example.add(nums[begin]);
                    example.add(nums[end]);
                    result.add(example);
                    while(begin<end && nums[begin]==nums[begin+1]) begin++;
                    while(begin<end && nums[end]==nums[end-1]) end--;
                    begin++;
                    end--;
                }else if (nums[i] + nums[begin] + nums[end] < 0){
                    begin++;
                }else{
                    end--;
                }
            }
            while(nums[i]==nums[i+1]&&i<nums.length-1) i++;
            i++;
        }
        return result;
    }
}
