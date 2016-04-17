/**
 * Created by YGZ on 2016/2/24.
 */
public class RemoveDuplicatesfromSortedArray {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int res = 1;
        for (int i=0;i<nums.length;i++){
            if (nums[i] == nums[res-1]){
                continue;
            }else{
                nums[res] = nums[i];
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums = {1,1,2};
        RemoveDuplicatesfromSortedArray removeDuplicatesfromSortedArray = new RemoveDuplicatesfromSortedArray();
        int i = removeDuplicatesfromSortedArray.removeDuplicates(nums);
        System.out.println(i);
    }
}
