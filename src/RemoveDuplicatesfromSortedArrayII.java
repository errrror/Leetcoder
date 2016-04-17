/**
 * Created by YGZ on 2016/3/30.
 */
public class RemoveDuplicatesfromSortedArrayII {
    public int removeDuplicates(int[] nums) {
        if (nums.length<=0) return 0;
        int res = 0,flag = 0,tem = nums[0];
        for (int i=0;i<nums.length;i++){
            if (nums[i]==tem&&flag<=1){
                nums[res++] = nums[i];
                flag++;
            }else if (nums[i]!=tem){
                flag = 1;
                tem = nums[i];
                nums[res++] = nums[i];
            }else if (flag>=2&&nums[i]==tem){
                continue;
            }else{
                flag = 0;
            }
        }
        return res;
    }
    public static void main(String[] args){
        RemoveDuplicatesfromSortedArrayII removeDuplicatesfromSortedArrayII = new RemoveDuplicatesfromSortedArrayII();
        int[] nums = {1,1,1,1,3,3};
        System.out.print(removeDuplicatesfromSortedArrayII.removeDuplicates(nums));
    }
}
