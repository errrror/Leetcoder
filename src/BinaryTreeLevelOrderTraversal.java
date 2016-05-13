import java.util.*;

/**
 * Created by YGZ on 2016/5/13.
 * My email : gzyang1125@foxmail.com
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if (root==null) return res;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()||!queue1.isEmpty()) {
            while (!queue.isEmpty()) {
                TreeNode tem = queue.poll();
                queue1.add(tem);
            }
            List<Integer> list = new ArrayList<Integer>();
            while (!queue1.isEmpty()) {
                TreeNode treeNode = queue1.poll();
                list.add(treeNode.val);
                if (treeNode.left!=null){queue.add(treeNode.left);}
                if (treeNode.right!=null){queue.add(treeNode.right);}
            }
            res.add(list);
        }
        return res;
    }
    public static void main(String[] args){
        TreeNode treeNode = new TreeNode(1);
        BinaryTreeLevelOrderTraversal binaryTreeLevelOrderTraversal = new BinaryTreeLevelOrderTraversal();
        System.out.println(binaryTreeLevelOrderTraversal.levelOrder(treeNode));
    }
}
