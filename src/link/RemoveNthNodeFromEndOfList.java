package link;

/**
 * ClassName RemoveNthNodeFromEndOfList<br>
 * Function <br>
 * <p>
 * Given a linked list, remove the n-th node from the end of list and return its head.
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/5/8 22:41
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy, fast = dummy;
        while(n-- >= 0 && fast != null){
            fast = fast.next;
        }
        while(fast != null){
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        System.out.println();
        return dummy.next;
    }
}
