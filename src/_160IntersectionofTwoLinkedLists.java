import common.ListNode;

public class _160IntersectionofTwoLinkedLists {
    public static void main(String[] args) {
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(3);
        headA.next.next = new ListNode(5);
        headA.next.next.next = new ListNode(7);
        headA.next.next.next.next = new ListNode(9);
        headA.next.next.next.next.next = new ListNode(11);
        headA.next.next.next.next.next.next = new ListNode(13);
        headA.next.next.next.next.next.next.next = new ListNode(15);
        headA.next.next.next.next.next.next.next.next = new ListNode(17);
        headA.next.next.next.next.next.next.next.next.next = new ListNode(19);
        headA.next.next.next.next.next.next.next.next.next.next = new ListNode(21);

        ListNode headB = new ListNode(2);

//        ListNode headA = new ListNode(1);
//        ListNode headB = new ListNode(1);

        System.out.println(new _160IntersectionofTwoLinkedLists().getIntersectionNode(headA, headB));
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        int lenA = 0, lenB = 0;
        ListNode pA, pB, ret = null;
        pA = headA;
        pB = headB;
        while (pA.next != null) {
            pA = pA.next;
            lenA++;
        }

        while (pB.next != null) {
            pB = pB.next;
            lenB++;
        }

        pA = headA;
        pB = headB;
        int diff = lenA > lenB ? (lenA - lenB) : (lenB - lenA);
        if (lenA > lenB) {
            for (int i = 0; i < diff; i++) {
                pA = pA.next;
                ret = pA;
            }
        } else {
            for (int i = 0; i < diff; i++) {
                pB = pB.next;
                ret = pB;
            }
        }

        while (pA != null && pB != null) {
            if (pA.val == pB.val) {
                ret = pA;
                break;
            } else if (pA.next != null && pB.next != null) {
                pA = pA.next;
                pB = pB.next;
            } else {
                return null;
            }
        }
        return ret;
    }
}
