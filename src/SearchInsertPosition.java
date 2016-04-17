/**
 * Created by YGZ on 2016/2/25.
 */
public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums.length<1) return 0;
        int l = nums.length-1;
        return search(nums,target,0,l);
    }
    int search(int[] nums,int target,int begin,int end){
        int mid = (begin+end)/2;
        if (target<=nums[begin]){
            return begin;
        }else if (target>nums[end]){
            return end+1;
        }else if (target<=nums[mid]){
            return search(nums,target,begin,mid-1);
        }else if (target>nums[mid]){
            return search(nums,target,mid+1,end);
        }
        return 0;
    }
}
