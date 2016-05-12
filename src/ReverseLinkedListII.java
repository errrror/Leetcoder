/**
 * Created by ygz on 16/5/9.
 * My email : gzyang1125@foxmail.com
 */
public class ReverseLinkedListII {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m==n) return head;
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode headtem=newHead,l=newHead;
        int i=0;
        while(l!=null&&i<n){
            if (i==m-1){
                headtem = l;
                l = l.next;
            }
            if (i<m-1) {
                l = l.next;
            }
            if (i>=m){
                ListNode tem = headtem.next;
                headtem.next = l.next;
                l.next = l.next.next;
                headtem.next.next = tem;
            }
            i++;
        }
        return newHead.next;
    }
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        head.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = null;
        ReverseLinkedListII reverseLinkedListII = new ReverseLinkedListII();
        ListNode res = reverseLinkedListII.reverseBetween(head,1,4);
        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }

    }
}
