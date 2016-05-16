import java.util.List;

/**
 * Created by YGZ on 2016/5/16.
 * My email : gzyang1125@foxmail.com
 */
public class ConvertSortedListtoBinarySearchTree {
    public TreeNode sortedListToBST(ListNode head) {
        if (head==null) return null;
        if (head.next==null) return new TreeNode(head.val);
        ListNode fast,slow;
        fast = head.next.next;
        slow = head;
        while (fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode tem = slow.next;
        slow.next = null;
        TreeNode root = new TreeNode(tem.val);
        root.left = sortedListToBST(head);
        root.right = sortedListToBST(tem.next);
        return root;
    }
}
