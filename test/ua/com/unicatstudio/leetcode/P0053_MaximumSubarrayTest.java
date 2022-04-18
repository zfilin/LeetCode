package ua.com.unicatstudio.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P0053_MaximumSubarrayTest {

  @Test
  void maxSubArray() {
    int result;
    int[] nums;

    nums = new int[] {3,-1};
    result = new P0053_MaximumSubarray().maxSubArray(nums);
    assertEquals(3, result);

    nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
    result = new P0053_MaximumSubarray().maxSubArray(nums);
    assertEquals(6, result);

    nums = new int[] {1};
    result = new P0053_MaximumSubarray().maxSubArray(nums);
    assertEquals(1, result);

    nums = new int[] {5,4,-1,7,8};
    result = new P0053_MaximumSubarray().maxSubArray(nums);
    assertEquals(23, result);

    nums = new int[] {-4,-1,-2};
    result = new P0053_MaximumSubarray().maxSubArray(nums);
    assertEquals(-1, result);
  }
}