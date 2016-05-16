import java.util.*;

/**
 * Created by YGZ on 2016/5/16.
 * My email : gzyang1125@foxmail.com
 */
public class BinaryTreeLevelOrderTraversalII {
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if (root==null) return res;
        Stack<List<Integer>> inres = new Stack<List<Integer>>();
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(root);
        Queue<TreeNode> queue1 = new ArrayDeque<TreeNode>();
        TreeNode tem ;
        while(!queue.isEmpty()||!queue1.isEmpty()){
            List<Integer> list = new ArrayList<Integer>();
            while (!queue.isEmpty()){
                tem = queue.poll();
                list.add(tem.val);
                if (tem.left!=null){queue1.add(tem.left);}
                if (tem.right!=null){queue1.add(tem.right);}
            }
            inres.push(list);
            while (!queue1.isEmpty()){
                queue.add(queue1.poll());
            }
        }
        while (!inres.isEmpty()){
            res.add(inres.pop());
        }
        return res;
    }
    public static void main(String[] args){
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        one.left = two;
        BinaryTreeLevelOrderTraversalII binaryTreeLevelOrderTraversalII = new BinaryTreeLevelOrderTraversalII();
        System.out.println(binaryTreeLevelOrderTraversalII.levelOrderBottom(one));
    }
}
