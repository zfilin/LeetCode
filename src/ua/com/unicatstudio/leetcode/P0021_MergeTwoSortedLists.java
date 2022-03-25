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
        else if (list2 == null) return list1;

        ListNode result;
        ListNode tail;
        if(list1.val < list2.val) {
            result = list1;
            tail = list1;
            list1 = list1.next;
        } else {
            result = list2;
            tail = list2;
            list2 = list2.next;
        }

        while (list1 != null && list2 != null)
        {
            if(list1.val < list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null) tail.next = list1;
        else tail.next = list2;

        return result;
    }
}
