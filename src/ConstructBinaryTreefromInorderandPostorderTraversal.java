/**
 * Created by YGZ on 2016/5/16.
 * My email : gzyang1125@foxmail.com
 */
public class ConstructBinaryTreefromInorderandPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length==0) return null;
        return helper(inorder,postorder,0,inorder.length-1,0,postorder.length-1);
    }
    public static TreeNode helper(int[] inorder,int[] postorder,int inbegin,int inend,int postbegin,int postend){
        if (postbegin==postend) return new TreeNode(postorder[postend]);
        if (postbegin>postend||postend<0) return null;
        int val = postorder[postend];
        TreeNode root = new TreeNode(val);
        int i=inbegin;
        for (;i<=inend;i++){
            if (inorder[i]==val) break;
        }
        root.left = helper(inorder,postorder,inbegin,i-1,postbegin,i-inbegin-1+postbegin);
        root.right = helper(inorder,postorder,i+1,inend,postend-inend+i,postend-1);
        return root;
    }
    public static void main(String[] args){
        int[] inorder = {1,3,2};
        int[] preorder = {3,2,1};
        ConstructBinaryTreefromInorderandPostorderTraversal c= new ConstructBinaryTreefromInorderandPostorderTraversal();
        System.out.println(c.buildTree(inorder,preorder));
    }
}
