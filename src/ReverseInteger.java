/**
 * Created by YGZ on 2016/3/2.
 */
public class ReverseInteger {
    public int reverse(int x) {
        if(x==Integer.MIN_VALUE)
            return 0;
        int num = Math.abs(x);
        int res = 0;
        for (;num!=0;)
        {
            //if(res>(Integer.MAX_VALUE-num%10)/10)
                //return 0;
            res = res*10+num%10;
            num /= 10;
            if(2147483647-res<100000000&&res>Integer.MAX_VALUE/10&&num!=0) return 0;
        }
        return x>0?res:-res;
    }
    public static void main(String args[]){
        ReverseInteger reverseInteger = new ReverseInteger();
        System.out.print(reverseInteger.reverse(1534236469));
    }

    /**
     * Created by YGZ on 2016/2/23.
     */
    public static class RemoveNthNodeFromEndofList {
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
}
