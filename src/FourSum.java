import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by YGZ on 2016/2/23.
 */
public class FourSum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> results = new ArrayList<List<Integer>>();
        if (nums == null) return null;
        if (nums.length<4) return results;
        Arrays.sort(nums);
        for (int i=0;i<nums.length-3;i++){
            if (i!=0&&nums[i] == nums[i-1]){
                continue;
            }
            for(int j=i+1;j<nums.length-2;j++){
                if (j!=i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int l = j + 1;
                int r = nums.length - 1;
                 while (l < r) {
                    int tem = nums[i] + nums[j] + nums[l] + nums[r];
                    if (tem < target) {
                        if (nums[l] == nums[r]) break;
                        while(nums[l] == nums[l+1]) l++;
                        l++;
                    }else if (tem > target){
                        if (nums[l] == nums[r]) break;
                        while(nums[r] == nums[r-1]) r--;
                        r--;
                    }else{
                        List<Integer> result = new ArrayList<Integer>();
                        result.add(nums[i]);
                        result.add(nums[j]);
                        result.add(nums[l]);
                        result.add(nums[r]);
                        results.add(result);
                        l++;
                        r--;
                        while(l<r && nums[l] == nums[l-1]){
                            l++;
                        }
                        while(l<r && nums[r] == nums[r+1]){
                            r--;
                        }
                    }
                }
            }
        }
        return results;
    }
    public static void main(String[] args){
        FourSum fourSum = new FourSum();
        int[] nums = {-1,0,-5,-5,-2,-2,-4,0,1,-2};
        fourSum.fourSum(nums,-9);
    }
}
