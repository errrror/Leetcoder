/**
 * Created by YGZ on 2016/3/8.
 */
public class MaximumSubarray {
    /*public int maxSubArray(int[] nums) {
        if (nums.length<1) return 0;
        int length = nums.length;
        int res = nums[0];
        for (int i=0;i<length;i++){
            if (nums[i]>0){
                int sum = 0;
                for (int j=i;j<length;j++){
                    sum += nums[j];
                    if (sum>res) res = sum;
                }
            }else{
                if (res<nums[i]){
                    res = nums[i];
                }
            }
        }
        return res;
    }*/
    public static int maxSubArray(int[] A) {
        int maxSoFar=A[0], maxEndingHere=A[0];
        for (int i=1;i<A.length;++i){
            maxEndingHere= Math.max(maxEndingHere+A[i],A[i]);
            maxSoFar=Math.max(maxSoFar, maxEndingHere);
        }
        return maxSoFar;
    }
    public static void main(String agrs[]){
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        System.out.println(maximumSubarray.maxSubArray(nums));
    }
}
