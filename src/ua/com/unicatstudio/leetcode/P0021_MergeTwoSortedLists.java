package ua.com.unicatstudio.leetcode;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class P0021_MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode t;
        if (list1.val > list2.val) {
            t = list1; list1 = list2; list2 = t;
        }

        ListNode result = list1;
        while (list2 != null) {
            while (list1.next != null && list1.next.val < list2.val)
                list1 = list1.next;
            t = list2;
            list2 = list1.next;
            list1.next = list1 = t;
        }

        return result;
    }
}
