import java.util.*;

/**
 * Created by YGZ on 2016/5/13.
 * My email : gzyang1125@foxmail.com
 */
public class BinaryTreeZigzagLevelOrderTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new LinkedList<List<Integer>>();
        if (root==null) return res;
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        Queue<TreeNode> queue1 = new ArrayDeque<TreeNode>();
        queue.add(root);
        int i=1;
        while (!queue.isEmpty()||!queue1.isEmpty()) {
            while (!queue.isEmpty()) {
                TreeNode tem = queue.poll();
                queue1.add(tem);
            }
            List<Integer> list = new ArrayList<Integer>();
            while (!queue1.isEmpty()) {
                if (i%2==1){
                    while (!queue1.isEmpty()) {
                        TreeNode tem = queue1.poll();
                        list.add(tem.val);
                        if (tem.left!=null){queue.add(tem.left);}
                        if (tem.right!=null){queue.add(tem.right);}
                    }
                }else {
                    Stack<TreeNode> stack1 = new Stack<TreeNode>();
                    Stack<TreeNode> stack2 = new Stack<TreeNode>();
                    while (!queue1.isEmpty()) {
                        stack1.push(queue1.poll());
                    }
                    while (!stack1.isEmpty()){
                        TreeNode tem = stack1.pop();
                        list.add(tem.val);
                        stack2.push(tem);
                    }
                    while (!stack2.isEmpty()){
                        queue1.add(stack2.pop());
                    }
                    while (!queue1.isEmpty()) {
                        TreeNode treeNode = queue1.poll();
                        if (treeNode.left!=null){queue.add(treeNode.left);}
                        if (treeNode.right!=null){queue.add(treeNode.right);}
                    }
                }
                i++;
                res.add(list);
            }
        }
        return res;
    }
    public static void main(String[] args){
        TreeNode treeNode = new TreeNode(1);
        BinaryTreeZigzagLevelOrderTraversal binaryTreeZigzagLevelOrderTraversal = new BinaryTreeZigzagLevelOrderTraversal();
        System.out.println(binaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(treeNode));
    }
}
