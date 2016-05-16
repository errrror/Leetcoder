/**
 * Created by YGZ on 2016/5/16.
 * My email : gzyang1125@foxmail.com
 */
public class ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length==0) return null;
        return getson(nums,0,nums.length-1);
    }
    public static TreeNode getson(int[] nums,int start,int end){
        if (start==end) return new TreeNode(nums[start]);
        if (start>end) return null;
        int mid = (start+end)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = getson(nums,start,mid-1);
        root.right = getson(nums,mid+1,end);
        return root;
    }
}
