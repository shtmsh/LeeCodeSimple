package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 14:21 2019/10/17
 * @MOdified By:
 */

/**
 * 反转一个单链表。
 */
public class ReverseList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    public static ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList1(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        ListNode listNode = reverseList(head);
        dump(listNode);

    }

    public static void dump(ListNode head) {
        if (head != null) {
            System.out.println(head.val);
            dump(head.next);
        }
    }
}
