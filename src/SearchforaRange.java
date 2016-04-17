/**
 * Created by YGZ on 2016/2/25.
 */
public class SearchforaRange {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        if (nums == null||nums.length == 0) return res;
        int i = 0;
        int j = nums.length-1;
        while (i<=j){
            if (nums[(i+j)/2]<target&&i<j){
                i=(i+j)/2+1;
            }else if (nums[(i+j)/2]==target){
                i = (i+j)/2;
                for (int k = i-1;k>=0;k--){
                    if (nums[k] == nums[i]){
                        i = k;
                    }else break;
                }
            }
            if (nums[(i+j)/2]>target&&i<j){
                j=(i+j)/2-1;
            }else if (nums[(i+j)/2] == target){
                j = (i+j)/2;
                for (int k = j+1;k<nums.length;k++){
                    if (nums[k] == nums[j]) {
                        j = k;
                    }else break;
                }
            }
            if (nums[i]==target&&nums[j]==target) {
                res[0] = i;
                res[1] = j;
                return res;
            }else if (i==j){
                return res;
            }
        }
        return res;
    }
    public static void main(String[] args){
        SearchforaRange searchforaRange = new SearchforaRange();
        int[] nums = {1,3};
        int[] res = searchforaRange.searchRange(nums,1);
        System.out.println(res[0]+","+res[1]);
    }
}
