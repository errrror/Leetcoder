/**
 * Created by YGZ on 2016/5/16.
 * My email : gzyang1125@foxmail.com
 */
public class PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        //if (root==null&&sum==0) return true;
        if (root==null) return false;
        if (root.right==null&&root.left==null&&root.val==sum) return true;
        return hasPathSum(root.left,sum-root.val)||hasPathSum(root.right,sum-root.val);
    }
}
