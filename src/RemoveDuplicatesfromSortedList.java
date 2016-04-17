/**
 * Created by YGZ on 2016/3/22.
 */
public class RemoveDuplicatesfromSortedList {
    public ListNode deleteDuplicates(ListNode head) {
        if (head==null||head.next==null) return head;
        ListNode node1,node2;
        node1 = head;
        node2 = head.next;
        while(node2.next!=null){
            if (node1.val==node2.val){
                node1.next = node2.next;
                node2 = node1.next;
            }else{
                node1 = node2;
                node2 = node1.next;
            }
        }
        if (node1.val==node2.val){
            node1.next = null;
        }
        return head;
    }
}
