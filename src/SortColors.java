/**
 * Created by YGZ on 2016/3/29.
 */
public class SortColors {
    public void sortColors(int[] nums) {
        if (nums.length<=0) return;
        int tem,low=0,mid=0,high = nums.length-1;
        while(mid<=high){
            if (nums[mid]==0){
                tem = nums[low];
                nums[low] = nums[mid];
                nums[mid] = tem;
                low++;
                mid++;
            }else if (nums[mid]==1){
                 mid++;
            }else {
                tem = nums[high];
                nums[high] = nums[mid];
                nums[mid] = tem;
                high--;
            }
        }
    }
}
