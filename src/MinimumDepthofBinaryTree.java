import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by YGZ on 2016/5/16.
 * My email : gzyang1125@foxmail.com
 */
public class MinimumDepthofBinaryTree {
    /*public int minDepth(TreeNode root) {
        if (root==null) return 0;
        Queue<TreeNode> queue1 = new ArrayDeque<TreeNode>();
        queue1.add(root);
        Queue<TreeNode> queue2 = new ArrayDeque<TreeNode>();
        int res=1;
        while (!queue1.isEmpty()){
            while (!queue1.isEmpty()){
                if (queue1.peek().left==null&&queue1.peek().right==null) return res;
                queue2.add(queue1.poll());
            }
            res++;
            while (!queue2.isEmpty()){
                TreeNode tem = queue2.poll();
                if (tem.left!=null){queue1.add(tem.left);}
                if (tem.right!=null){queue1.add(tem.right);}
            }
        }
        return res;
    }*/
    //高手的做法
    public int minDepth(TreeNode root){
        if (root==null) return 0;
        return helper(root,1);
    }
    public static int helper(TreeNode root,int depth){
        if (root==null) return Integer.MAX_VALUE;
        if (root.left==null&&root.right==null) return depth;
        return Math.min(helper(root.left,depth+1),helper(root.right,depth+1));
    }
    public static void main(String[] args){
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        TreeNode four = new TreeNode(4);
        TreeNode five = new TreeNode(5);
        one.left = two;
        one.right = three;
        two.left = four;
        three.right = five;
        MinimumDepthofBinaryTree minimumDepthofBinaryTree = new MinimumDepthofBinaryTree();
        System.out.println(minimumDepthofBinaryTree.minDepth(one));
    }
}
