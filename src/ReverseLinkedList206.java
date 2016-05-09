import common.ListNode;

public class ReverseLinkedList206 {
    private ListNode reverseList(ListNode head){
        if (head == null || head.next == null) {
            return head;
        }
        ListNode temp = head.next;
        ListNode ret = reverseList(temp);

        head.next = null;
        temp.next = head;
        return ret;
    }

    public ListNode reverseList1(ListNode head){
        if (head == null || head.next == null) return head;

        ListNode pre = head;
        ListNode p = head.next;
        pre.next = null;
        ListNode nxt;
        while (p != null) {
            nxt = p.next;
            p.next = pre;
            pre = p;
            p = nxt;
        }
        return pre;
    }
}
