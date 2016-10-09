import common.ListNode;

public class _237DeleteNode {
    public static void main(String[] args){
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

    }

    public void deleteNode(ListNode node){
        if (node != null) {
            ListNode temp = node.next;
            node.val = temp.val;
            node.next = temp.next;
        }
    }
}
