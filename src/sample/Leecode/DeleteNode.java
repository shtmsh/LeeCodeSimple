package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 16:01 2019/10/21
 * @MOdified By:
 */

/**
 * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点
 */
public class DeleteNode {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
