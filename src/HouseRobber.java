/**
 * Created by YGZ on 2016/5/26.
 * My email : gzyang1125@foxmail.com
 */
public class HouseRobber {
    public int rob(int[] nums) {
        if(nums.length==0) return 0;
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0],nums[1]);
        //int[] res = new int[nums.length];
        //res[0] = nums[0];
        nums[1] = Math.max(nums[0],nums[1]);
        for (int i=2;i<nums.length;i++){
            //res[i] = Math.max(nums[i],res[i-1]);
            nums[i] = Math.max(nums[i-1],nums[i]+nums[i-2]);
        }
        return nums[nums.length-1];
    }

    public static void main(String[] args) {
        int[] nums = {2,1,1,2};
        HouseRobber houseRobber = new HouseRobber();
        System.out.println(houseRobber.rob(nums));
    }
}
