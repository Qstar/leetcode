import common.ListNode;

public class SwapNodesinPairs24 {
    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        ListNode aa = new ListNode(2);
        ListNode aaa = new ListNode(3);
        ListNode aaaa = new ListNode(4);
        a.next = aa;
        aa.next = aaa;
        aaa.next = aaaa;

        traverse(a);

        System.out.println();

        ListNode head = swapPairs(a);
        traverse(head);
    }

    private static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode temp = head.next;
        head.next = swapPairs(temp.next);
        temp.next = head;
        return temp;
    }

    private static void traverse(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null)
                System.out.print("->");
            head = head.next;
        }
    }
}
