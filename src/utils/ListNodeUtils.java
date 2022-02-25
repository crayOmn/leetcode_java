package utils;

import entities.ListNode;

public class ListNodeUtils {
    /**
     * Convert array to ListNode
     *
     * @param arr
     * @return
     */
    public static ListNode arrayToListNode(int[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        int length = arr.length;
        ListNode head = new ListNode(arr[0]);
        ListNode temp = head;

        for (int i = 1; i < length; i++) {
            temp.next = new ListNode(arr[i]);
            temp = temp.next;
        }
        return head;
    }
}
