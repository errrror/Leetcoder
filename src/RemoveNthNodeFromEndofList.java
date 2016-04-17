/**
 * Created by YGZ on 2016/2/23.
 */
public class RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) return null;
        if (head.next==null) return null;
        ListNode p1 = head;
        ListNode p2 = head;
        ListNode remove = head;
        for (int i=0;i<n;i++){
            p2 = p2.next;
        }
        while(p2 != null){
            p2 = p2.next;
            p1 = remove;
            remove = remove.next;
        }
        if (remove == head){
            head = head.next;
        }else{
            p1.next = remove.next;
        }
        return head;
    }
}