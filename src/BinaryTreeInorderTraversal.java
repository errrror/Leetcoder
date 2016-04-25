import java.util.ArrayList;
import java.util.List;

/**
 * Created by YGZ on 2016/4/25.
 * My email : errrrorer@foxmail.com
 */
public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        if (root==null) return res;
        helper(res,root);
        return res;
    }
    public static void helper(List<Integer> res,TreeNode root){
        if (root==null) return ;
        if (root.left!=null){
            helper(res,root.left);
        }
        res.add(root.val);
        if (root.right!=null){
            helper(res,root.right);
        }
        return;
    }
}
