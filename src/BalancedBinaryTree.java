import java.util.ArrayDeque;
import java.util.Queue;

/**
 * Created by YGZ on 2016/5/16.
 * My email : gzyang1125@foxmail.com
 */
public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        if (root==null) return true;
        if (Math.abs(leval(root.left)-leval(root.right))<=1&&isBalanced(root.left)&&isBalanced(root.right)) return true;
        else return false;
    }
    //简单地求树的高度
    public static int leval(TreeNode root){
        if (root==null) return 0;
        return Math.max(leval(root.left),leval(root.right))+1;
    }
    /*public static int leval(TreeNode root){
        if (root==null) return 0;
        Queue<TreeNode> queue1 = new ArrayDeque<TreeNode>();
        queue1.add(root);
        Queue<TreeNode> queue2 = new ArrayDeque<TreeNode>();
        int res=0;
        while (!queue1.isEmpty()){
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
        return res;
    }*/
    public static void main(String[] args){
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        one.right = two;
        two.right = three;
        BalancedBinaryTree balancedBinaryTree = new BalancedBinaryTree();
        System.out.println(balancedBinaryTree.isBalanced(one));
    }
}
