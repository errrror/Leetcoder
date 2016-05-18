import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by YGZ on 2016/5/17.
 * My email : gzyang1125@foxmail.com
 */
public class PathSumII {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> lists = new LinkedList<List<Integer>>();
        if (root==null) return lists;
        List<Integer> list = new ArrayList<Integer>();
        list.add(root.val);
        helper(lists,list,root,sum-root.val);
        return lists;
    }
    public static void helper(List<List<Integer>> lists,List<Integer> list,TreeNode root,int sum){
        //if (root==null) return;
        if (sum==0&&root.left==null&&root.right==null){
            //list.add(root.val);
            lists.add(new ArrayList<Integer>(list));
        }else {
            //list.add(root.val);
            if (root.left!=null) {
                list.add(root.left.val);
                helper(lists, list, root.left, sum - root.left.val);
                list.remove(list.size()-1);
            }
            if (root.right!=null) {
                list.add(root.right.val);
                helper(lists, list, root.right, sum - root.right.val);
                list.remove(list.size() - 1);
            }
        }
        return;
    }
    public static void main(String[] args){
        TreeNode zero = new TreeNode(0);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(1);
        //TreeNode three = new TreeNode(3);
        zero.left = one;
        zero.right = two;
        PathSumII pathSumII = new PathSumII();
        System.out.println(pathSumII.pathSum(zero,1));
    }
}
