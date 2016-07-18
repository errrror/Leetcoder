/**
 * Created by YGZ on 2016/7/18.
 * My email : gzyang1125@foxmail.com
 */
public class ReverseNodesinkGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k==0||k==1||head==null||head.next==null){
            return head;
        }
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode last = newHead;
        ListNode first = newHead;
        ListNode tem = newHead;
        boolean exit = false;
        while(true){
            int n=1;
            first = tem.next;
            last = first;
            if(first==null) break;
            while(n<k){
                last = last.next;
                n++;
                if(last==null){
                    exit = true;
                    break;
                }

            }
            if(exit) break;
            tem.next = reverse(first,last);
            tem = first;
        }
        return newHead.next;
    }
    public static ListNode reverse(ListNode first,ListNode last){
        ListNode nh = new ListNode(0);
        ListNode tem = first;
        nh.next = first;
        while(first.next!=last){
            tem = first.next;
            first.next = tem.next;
            tem.next = nh.next;
            nh.next = tem;
        }
        tem = first.next;
        first.next = tem.next;
        tem.next = nh.next;
        nh.next = tem;
        return last;
    }
}
