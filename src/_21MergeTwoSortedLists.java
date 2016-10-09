import common.ListNode;

public class _21MergeTwoSortedLists {
    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode ret = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                ret.next = l1;
                l1 = l1.next;
            } else {
                ret.next = l2;
                l2 = l2.next;
            }
            ret = ret.next;
        }
        ret.next = (l1 != null) ? l1 : l2;
        return head.next;
    }
}
