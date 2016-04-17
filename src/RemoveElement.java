/**
 * Created by YGZ on 2016/2/24.
 */
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int i = 0;
        int j = nums.length-1;
        while(i<=j){
            if (nums[j] == val){
                j--;
            }else if (nums[i] != val){
                i++;
            }else {
                nums[i] = nums[j];
                j--;
            }
        }
        return j+1;
    }
    public static void main(String[] args){
        RemoveElement removeElement = new RemoveElement();
        int[] nums = {1};
        int res = removeElement.removeElement(nums,1);
        System.out.println(res);
    }
}
