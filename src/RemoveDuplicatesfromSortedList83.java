import common.ListNode;

public class RemoveDuplicatesfromSortedList83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode pre = head;
        ListNode p = head.next;
        while (pre != null && p != null) {
            if (pre.val == p.val) {
                ListNode toDelete = p;
                pre.next = p.next;
                p = p.next;
                toDelete = null;
            } else {
                pre = pre.next;
                p = p.next;
            }
        }
        return head;
    }
}
