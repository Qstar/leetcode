import common.ListNode;

public class _19RemoveNthNodeFromEndofList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode first = head;
        ListNode second = head;
        ListNode temp = second;

        for (int i = 0; i < n; i++) {
            first = first.next;
        }

        while (first != null) {
            first = first.next;
            temp = second;
            second = second.next;
        }

        if (second == head) {
            head = head.next;
        } else {
            temp.next = second.next;
        }
        return head;
    }
}


