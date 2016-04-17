/**
 * Created by YGZ on 2016/3/31.
 */
public class RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head.next==null) return head;
        ListNode l1 = head;
        ListNode l2 = l1.next;
        while(l1.val==l2.val){
            l2 = l2.next;
        }
        head = l2;
        ListNode now = head.next;
        while(now!=null){
            if (now.next==null){
                return head;
            }else{
                now.next = helper(now,now.next);
                now
            }
        }
    }
    public ListNode helper(ListNode l1,ListNode l2){
        while(l1.val == l2.val){
            l2 = l2.next;
        }
        return l2;
    }
}
