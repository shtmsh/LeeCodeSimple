package sample.Leecode;

/**
 * @Author: liutianxin
 * @Description
 * @Date: Created in 16:26 2019/10/21
 * @MOdified By:
 */

/**
 * 请判断一个链表是否为回文链表。
 */
public class IsPalindrome {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    /**
     * 快慢指针获取链表的中间节点
     * @param head
     * @return
     */
    public static ListNode findMidNode(ListNode head){
        ListNode slow = head.next;
        ListNode fast = head.next.next;

        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    /**
     * 反转链表
     * @param head
     * @return
     */
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;//反转后头节点的前节点应该为NULL
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;//保存下一个节点
            curr.next = prev;//将当前节点的下一节点设置为前一个节点，头节点反转之后的下一个节点就是NULL
            prev = curr;//反转之后当前节点变为前一个节点
            curr = nextTemp;//继续下一个循环
        }
        return prev;
    }

    public static boolean isPalindrome(ListNode head) {
       if (head == null || head.next == null){
           return true;
       }

        ListNode fast = head.next.next;
        ListNode slow = head.next;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode prev = null;
        ListNode curr = head;
        while (curr != slow){
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        if (fast != null){
            slow = slow.next;
        }

        while (prev != null){
            if (prev.val != slow.val){
                return false;
            }
            prev = prev.next;
            slow = slow.next;
        }
        return true;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(3);
        ListNode head3 = new ListNode(2);
        ListNode head4 = new ListNode(1);

        head.next  = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;

        System.out.println(IsPalindrome.isPalindrome(head));
    }

    public static void dump(ListNode node){
        ListNode curr = node;
        while (curr != null){
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}
