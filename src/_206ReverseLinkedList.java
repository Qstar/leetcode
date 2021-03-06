import common.ListNode;

public class _206ReverseLinkedList {
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
        ListNode next;
        while (p != null) {
            next = p.next;
            p.next = pre;
            pre = p;
            p = next;
        }
        return pre;
    }
}
