import java.util.List;

/**
 * Created by YGZ on 2016/3/31.
 */
public class RemoveDuplicatesfromSortedListII {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode l1 = new ListNode(0);
        ListNode l2 = l1;
        int count = 1;
        while (head.next!=null){
            if (head.next.val==head.val){
                head = head.next;
                count++;
            }else if (count!=1){
                head = head.next;
                count = 1;
            }else {
                l2.next = head;
                head = head.next;
                l2 = l2.next;
            }
        }
        if (count!=1){
            l2.next = null;
        }else {
            l2.next= head;
            l2.next.next = null;
        }
        return l1.next;
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
