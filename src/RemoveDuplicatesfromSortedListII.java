/**
 * Created by YGZ on 2016/3/31.
 */
public class RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode l1 = head;
        ListNode l2 = l1.next;
        while(l1.val==l2.val){
            head = l2.next;
        }
        if (head==null) return head;
        ListNode now = head.next;
        while(now!=null){
            if (now.next==null){
                return head;
            }else{
                now.next = helper(now,now.next);
                now = now.next;
            }
        }
        return head;
    }
    public ListNode helper(ListNode l1,ListNode l2){
        while(l1.val == l2.val){
            l2 = l2.next;
        }
        return l2;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode l = head;
        l.next = new ListNode(2);
        l = l.next;
        l.next = new ListNode(3);
        l = l.next;
        l.next = new ListNode(3);
        l = l.next;
        l.next = new ListNode(4);
        l = l.next;
        l.next = new ListNode(4);
        l = l.next;
        l.next = new ListNode(5);
        RemoveDuplicatesfromSortedListII removeDuplicatesfromSortedListII = new RemoveDuplicatesfromSortedListII();
        removeDuplicatesfromSortedListII.deleteDuplicates(head);
    }
}
