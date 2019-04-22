package link;

/**
 * ClassName AddTwoNumbers03<br>
 * Function <br>
 * <p>
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * Example:
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 * </p>
 *
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/4/22 21:44
 */
public class AddTwoNumbers03 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode cur = dummyHead;
        int carray = 0;
        int x, y, sum;
        while (l1 != null || l2 != null) {
            x = (l1 != null) ? l1.val : 0;
            y = (l2 != null) ? l2.val : 0;
            sum = x + y + carray;
            cur.next = new ListNode(sum % 10);
            carray = sum / 10;
            cur = cur.next;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (carray > 0) {
            cur.next = new ListNode(carray);
        }
        return dummyHead.next;
    }
}
