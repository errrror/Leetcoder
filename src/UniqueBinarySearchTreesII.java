import sun.reflect.generics.tree.Tree;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by YGZ on 2016/5/16.
 * My email : gzyang1125@foxmail.com
 */
public class UniqueBinarySearchTreesII {
    public List<TreeNode> generateTrees(int n) {
        List<TreeNode> res = new ArrayList<TreeNode>();
        if (n==0) return res;
        return helper(1,n);
    }
    public List<TreeNode> helper(int start,int end){
        List<TreeNode> res = new ArrayList<TreeNode>();
        if (start>end){
            res.add(null);
            return res;
        }
        for (int i=start;i<=end;i++){
            List<TreeNode> leftnode = helper(start,i-1);
            List<TreeNode> rightnode = helper(i+1,end);
            for (TreeNode left:leftnode){
                for (TreeNode right:rightnode){
                    TreeNode root = new TreeNode(i);
                    root.left = left;
                    root.right = right;
                    res.add(root);
                }
            }
        }
        return res;
    }
}
