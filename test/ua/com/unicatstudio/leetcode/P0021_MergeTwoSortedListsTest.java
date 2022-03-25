package ua.com.unicatstudio.leetcode;

import org.junit.jupiter.api.Test;

import javax.lang.model.type.NullType;

import static org.junit.jupiter.api.Assertions.*;

class P0021_MergeTwoSortedListsTest {

    @Test
    void mergeTwoLists() {

        ListNode list1 = null;
        ListNode prevNode = null;
        for (int i = 1; i < 15; i+=2) {
            ListNode newNode = new ListNode(i);
            if (prevNode != null) prevNode.next = newNode;
            else list1 = newNode;
            prevNode = newNode;
        }

        ListNode list2 = null;
        prevNode = null;
        for (int i = 1; i < 25; i+=3) {
            ListNode newNode = new ListNode(i);
            if (prevNode != null) prevNode.next = newNode;
            else list2 = newNode;
            prevNode = newNode;
        }

        ListNode result = new P0021_MergeTwoSortedLists().mergeTwoLists(list1, list2);
    }
}