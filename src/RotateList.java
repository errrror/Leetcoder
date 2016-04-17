import java.util.Iterator;

/**
 * Created by YGZ on 2016/3/14.
 */
public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {
        if (head ==null || k<=0) return head;
        ListNode tail = head;
        int len = 1;
        while(tail.next!=null){
            tail = tail.next;
            len++;
        }
        k %= len;
        ListNode p = head;
        for (int i=0;i<len-1-k;i++){
            p = p.next;
        }
        tail.next = head;
        head = p.next;
        p.next = null;
        return head;
    }
    public static void main(String args[]){
        RotateList rotateList = new RotateList();
        ListNode head = new ListNode(1);
        ListNode node2 = new ListNode(2);
        head.next = node2;
        ListNode res = rotateList.rotateRight(head,1);
        while(res!=null) {
            System.out.println(res.val);
            res = res.next;
        }
    }
}
