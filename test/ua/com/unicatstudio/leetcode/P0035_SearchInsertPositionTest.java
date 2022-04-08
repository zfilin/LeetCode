package ua.com.unicatstudio.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P0035_SearchInsertPositionTest {

  @Test
  void searchInsert() {
    int result;
    int[] nums;

    nums = new int[]{1, 3, 5, 6};
    result = new P0035_SearchInsertPosition().searchInsert(nums, 5);
    assertEquals(2, result);

    nums = new int[]{1, 3, 5, 6};
    result = new P0035_SearchInsertPosition().searchInsert(nums, 2);
    assertEquals(1, result);

    nums = new int[]{1, 3, 5, 6};
    result = new P0035_SearchInsertPosition().searchInsert(nums, 7);
    assertEquals(4, result);

  }
}