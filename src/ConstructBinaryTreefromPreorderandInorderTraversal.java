/**
 * Created by YGZ on 2016/5/16.
 * My email : gzyang1125@foxmail.com
 */
public class ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length==0) return null;
        return sonTree(preorder,inorder,0,preorder.length-1,0,inorder.length-1);
    }
    public static TreeNode sonTree(int[] preorder,int[] inorder,int prebegin,int preend,int inbegin,int inend){
        if (preend==prebegin) return new TreeNode(preorder[prebegin]);
        if (prebegin>preorder.length-1||prebegin>preend) return null;
        int val = preorder[prebegin];
        TreeNode root = new TreeNode(val);
        int i=inbegin;
        for (;i<=inend;i++){
            if (inorder[i] == val) break;
        }
        root.left = sonTree(preorder,inorder,prebegin+1,i-inbegin+prebegin,inbegin,i-1);
        root.right = sonTree(preorder,inorder,i-inbegin+prebegin+1,preend,i+1,inend);
        return root;
    }
}
