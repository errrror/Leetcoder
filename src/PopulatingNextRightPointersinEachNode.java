import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by YGZ on 2016/5/18.
 * My email : gzyang1125@foxmail.com
 */
public class PopulatingNextRightPointersinEachNode {
    public void connect(TreeLinkNode root) {
        if (root==null) return;
        Queue<TreeLinkNode> queue1 = new ArrayDeque<TreeLinkNode>();
        Queue<TreeLinkNode> queue2 = new ArrayDeque<TreeLinkNode>();
        queue1.add(root);
        while (!queue1.isEmpty()){
            while (!queue1.isEmpty()) {
                TreeLinkNode tem = queue1.poll();
                queue2.add(tem);
                if (queue1.isEmpty()) {
                    tem.next = null;
                } else {
                    tem.next = queue1.peek();
                }
            }
            while (!queue2.isEmpty()){
                TreeLinkNode tem = queue2.poll();
                if (tem.left!=null){queue1.add(tem.left);}
                if (tem.right!=null){queue1.add(tem.right);}
            }
        }
    }
}
