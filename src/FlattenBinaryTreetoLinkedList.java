/**
 * Created by YGZ on 2016/5/18.
 * My email : gzyang1125@foxmail.com
 */
public class FlattenBinaryTreetoLinkedList {
    public void flatten(TreeNode root) {
        if (root==null) return;
        TreeNode tem = root;
        do {
            helper(tem);
            if (tem.right!=null){tem = tem.right;}
            //else break;
            while (tem.left!=null&&tem.right==null){
                helper(tem);
                tem = tem.right;
            }
        }while (tem.right!=null);
        helper(tem);
    }
    public static void helper(TreeNode root){
        if (root.left==null) return;
        TreeNode right = root.right;
        root.right = root.left;
        root.left = null;
        TreeNode tem = root;
        while(tem.right!=null){
            tem = tem.right;
        }
        tem.right = right;
    }
    public static void main(String[] args){
        TreeNode zero = new TreeNode(0);
        TreeNode one = new TreeNode(1);
        TreeNode two = new TreeNode(2);
        TreeNode three = new TreeNode(3);
        one.left = two;
        //two.left = three;
        //one.right = three;
        FlattenBinaryTreetoLinkedList flattenBinaryTreetoLinkedList = new FlattenBinaryTreetoLinkedList();
        flattenBinaryTreetoLinkedList.flatten(one);
        System.out.println(one);
    }
}
