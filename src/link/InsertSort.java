package link;


/**
 * ClassName InsertSort<br>
 * Function <br>
 * <p>
 *     Sort a linked list using insertion sort.
 * </p>
 * @author 辛江勇
 * @version 1.0.0
 * @date 2019/4/21 21:31
 */
public class InsertSort {
    public ListNode insertionSortList(ListNode head) {
        //创立哑结点
        ListNode  dummy = new ListNode(0);
        ListNode cur = head;
        ListNode pre = dummy;
        ListNode next;
        while(cur.next != null){
            //暂存下一个结点
            next = cur.next;
            //寻找插入位置
            while(pre.next != null && pre.next.val < cur.val){
                pre = pre.next;
            }
            //插入当前结点
            cur.next = pre.next;
            pre.next = cur;
            //处理下一节点
            cur = next;
        }
        return dummy.next;
    }
}
