package utils;

import entities.ListNode;

import java.util.HashSet;
import java.util.Set;

public class OutputUtils {
    public static void print1DIntegerArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }

    /**
     * Print a one-dimensional ListNode (linked list node) type array
     *
     * @param arr
     */
    public static void print1DListNodeArray(ListNode[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                System.out.println("null");
            } else {
                OutputUtils.printListNode(arr[i]);
            }
        }
    }

    /**
     * Print ListNode (linked list node)
     *
     * @param listNode
     */
    public static void printListNode(ListNode listNode) {
        Set<ListNode> set = new HashSet<>();

        while (listNode != null) {
            set.add(listNode);
            System.out.format("[val=%s,next.val=%s]", listNode.val,
                    listNode.next == null ? null : listNode.next.val);
            listNode = listNode.next;

            if (listNode != null) {
                System.out.print(" ==> ");
            }

            if (set.contains(listNode)) {
                System.out.format("[val=%s,next.val=%s]", listNode.val,
                        listNode.next == null ? null : listNode.next.val);
                break;
            }
        }
        System.out.println();
    }
}
