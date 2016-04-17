import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by YGZ on 2016/3/31.
 */
public class SearchinRotatedSortedArray {
    /*public int search(int[] nums, int target) {
        int mid = 0;
        for (;mid<=nums.length;mid++){
            if (mid+1==nums.length||nums[mid]>nums[mid+1]) break;
        }
        if (mid+1==nums.length){
            return helper(nums,0,mid,target);
        }else if (target==nums[mid]){
            return mid;
        }else if (target<nums[mid]&&target>=nums[0]){
            return helper(nums,0,mid,target);
        }else {
            return helper(nums,mid+1,nums.length-1,target);
        }
    }*/
    public boolean search(int[] nums, int target){
        int mid = nums.length-1;
        while(mid>=0){
            if (nums[mid]==target) return true;
            if (nums[0]<nums[mid]){
                return helper(nums,0,mid,target);
            }else {
                mid--;
            }
        }
        return false;
    }
    private boolean helper(int[] nums,int start,int end,int target){
        if (start>end) return false;
        if (nums[start] == target) return true;
        if (nums[end] == target) return true;
        int mid = (start+end)/2;
        if (nums[mid] == target) return true;
        if (target<nums[mid]){
            return helper(nums,start,mid-1,target);
        }else {
            return helper(nums,mid+1,end,target);
        }
    }
    public static void main(String[] args){
        int[] num = {3,5,1};
        int target = 3;
        SearchinRotatedSortedArray searchinRotatedSortedArray = new SearchinRotatedSortedArray();
        System.out.print(searchinRotatedSortedArray.search(num,target));
    }
}
