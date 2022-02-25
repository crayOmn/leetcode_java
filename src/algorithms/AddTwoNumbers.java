package algorithms;


import entities.ListNode;
import utils.ListNodeUtils;
import utils.OutputUtils;

/**
 * Description:
 *
 *You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a single digit. Add the two numbers and return the sum as a linked list.
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 *
 * Example 1:
 *
 * Input: l1 = [2,4,3], l2 = [5,6,4]
 * Output: [7,0,8]
 * Explanation: 342 + 465 = 807.
 *
 * Example 2:
 *
 * Input: l1 = [0], l2 = [0]
 * Output: [0]
 *
 *
 * Example 3:
 *
 * Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
 * Output: [8,9,9,9,0,0,0,1]
 *
 *
 * @author otmancr
 *
 * */
public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode listNode11 = ListNodeUtils.arrayToListNode(new int[]{2, 4, 3});
        ListNode listNode12 = ListNodeUtils.arrayToListNode(new int[]{5, 6, 4});
        OutputUtils.printListNode(addTwoNumbers(listNode11, listNode12));

        ListNode listNode21 = ListNodeUtils.arrayToListNode(new int[]{1, 2, 1});
        ListNode listNode22 = ListNodeUtils.arrayToListNode(new int[]{9, 9, 9});
        OutputUtils.printListNode(addTwoNumbers(listNode21, listNode22));

        ListNode listNode31 = ListNodeUtils.arrayToListNode(new int[]{7, 2, 4, 3});
        ListNode listNode32 = ListNodeUtils.arrayToListNode(new int[]{5, 6, 4});
        OutputUtils.printListNode(addTwoNumbers(listNode31, listNode32));
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carryBit = 0;
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        while (l1 != null || l2 != null) {
            int sum = carryBit;

            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            if (sum >= 10) {
                sum -= 10;
                carryBit = 1;
            } else {
                carryBit = 0;
            }

            curr.next = new ListNode(sum);
            curr = curr.next;
        }

        if (carryBit == 1) {
            curr.next = new ListNode(carryBit);
        }
        return dummy.next;
    }
}
