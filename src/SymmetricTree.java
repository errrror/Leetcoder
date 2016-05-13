/**
 * Created by YGZ on 2016/5/13.
 * My email : gzyang1125@foxmail.com
 */
public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if (root==null) return true;
        return isSame(root.left,root.right);
    }
    public static boolean isSame(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }else if (!(p!=null&&q!=null)){
            return false;
        }
        if (p.val!=q.val) return false;
        return isSame(p.left,q.right)&&isSame(p.right,q.left);
    }
}
