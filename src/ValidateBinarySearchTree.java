import java.util.BitSet;

/**
 * Created by YGZ on 2016/5/12.
 * My email : gzyang1125@foxmail.com
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        if (root==null) return true;
        return helper(root.left,Long.MIN_VALUE,root.val,true)&&helper(root.right,root.val,Long.MAX_VALUE,false);
    }
    //flag is true meaning the left tree
    public static boolean helper(TreeNode root,long min,long max,boolean flag){
        if (root==null) return true;
        if (flag){
            if (root.val<max&&root.val>min){
                return helper(root.left,min,root.val,true)&&helper(root.right,root.val,max,false);
            }else return false;
        }else {
            if (root.val<max&&root.val>min){
                return helper(root.left,min,root.val,true)&&helper(root.right,root.val,max,false);
            }else return false;
        }
    }
}
