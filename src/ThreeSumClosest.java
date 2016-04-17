import java.util.Arrays;

/**
 * Created by YGZ on 2016/2/23.
 */
public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int target) {
        if (nums == null) return 0;
        if (nums.length < 3) return 0;
        Arrays.sort(nums);
        int inter = Integer.MAX_VALUE;
        int result = 0;
        for (int i = 0;i<nums.length-2;i++){
            int l = i+1;
            int r = nums.length-1;
            while(l<r) {
                int tem = nums[i] + nums[l] + nums[r];
                if (tem < target) {
                    if (Math.abs(target - tem) < inter) {
                        inter = Math.abs(target - tem);
                        result = tem;
                    }
                    l++;
                }else if (tem>target){
                    if (Math.abs(tem-target)<inter){
                        inter = Math.abs(tem-target);
                        result = tem;
                    }
                    r--;
                }else{
                    return tem;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){
        int[] nums = {-1,2,1,-4};
        ThreeSumClosest threeSumClosest = new ThreeSumClosest();
        int result = threeSumClosest.threeSumClosest(nums,1);
        System.out.println(result);
    }
}
