/**
 * Created by YGZ on 2016/5/13.
 * My email : gzyang1125@foxmail.com
 */
public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        return isSame(p,q);
    }
    public static boolean isSame(TreeNode p,TreeNode q){
        if(p==null&&q==null){
            return true;
        }else if (!(p!=null&&q!=null)){
            return false;
        }
        if (p.val!=q.val) return false;
        return isSame(p.left,q.left)&&isSame(p.right,q.right);
    }
}
