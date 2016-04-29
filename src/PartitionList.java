/**
 * Created by YGZ on 2016/4/18.
 * My email : errrrorer@foxmail.com
 */
public class PartitionList {
    public ListNode partition(ListNode head, int x) {
        if (head==null) return head;
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        ListNode l11=l1,l22=l2;
        ListNode lh = head;
        while (lh!=null){
            ListNode tem = lh.next;
            if (lh.val<x){
                l11.next = lh;
                l11 = l11.next;
                l11.next = null;
            }else {
                l22.next=lh;
                l22 = l22.next;
                l22.next = null;
            }
            lh = tem;
        }
        l11.next = l2.next;
        return l1.next;
    }
    public static void main(String[] args){
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(1);
        l1.next = l2;
        PartitionList partitionList = new PartitionList();
        ListNode res = partitionList.partition(l1,2);
        while (res!=null){
            System.out.println(res.val);
            res = res.next;
        }
    }
}
