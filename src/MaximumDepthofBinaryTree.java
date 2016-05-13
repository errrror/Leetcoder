import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by YGZ on 2016/5/13.
 * My email : gzyang1125@foxmail.com
 */
public class MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if (root==null) return 0;
        /*int res = 0;
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
        queue1.add(root);
        while (!queue1.isEmpty()||!queue2.isEmpty()){
            while (!queue1.isEmpty()){
                queue2.add(queue1.poll());
            }
            while (!queue2.isEmpty()){
                TreeNode tem = queue2.poll();
                if (tem.left!=null){queue1.add(tem.left);}
                if (tem.right!=null){queue1.add(tem.right);}
            }
            res++;
        }
        return res;*/
        return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}
