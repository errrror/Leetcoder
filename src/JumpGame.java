/**
 * Created by YGZ on 2016/3/10.
 */
public class JumpGame {
    /*public boolean canJump(int[] nums) {
        if (nums.length<1) return true;
        if (nums.length==1&&nums[0]!=0){
            return false;
        }else if (nums.length==1&&nums[0]==0){
            return true;
        }
        return helper(nums,0);
    }
    public static boolean helper(int[] nums,int start){
        if (start>nums.length-1||(nums[start]==0&&start<nums.length-1)) return false;
        if (start+nums[start]<nums.length-1){
            return helper(nums,start+nums[start]);
        }else if (start+nums[start]==nums.length-1){
            return true;
        }else{
            return false;
        }
    }*/
    public boolean canJump(int[] nums) {
        if (nums.length<1) return true;
        if(nums.length>1&&nums[0]==0) return false;
        int step=nums[0];
        for (int i=1;i<nums.length;i++){
            if (step>0){
                step--;
                step = Math.max(step,nums[i]);
            }
            if (step == 0) return false;
            if (step+i>=nums.length-1) return true;
        }
        return false;
    }
    public static void main(String args[]){
        int[] nums = {0,1};
        JumpGame jumpGame = new JumpGame();
        System.out.println(jumpGame.canJump(nums));
    }
}
