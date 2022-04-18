package ua.com.unicatstudio.leetcode;

public class P0053_MaximumSubarray {
  // https://leetcode.com/problems/maximum-subarray/

  public int maxSubArray(int[] nums) {
    int result = nums[0];

    int currentSum = 0;
    int minSum = 0;
    for (int num : nums) {
      if (minSum > currentSum) {
        minSum = currentSum;
      }
      currentSum += num;
      int t = currentSum - minSum;
      if (result < t) {
        result = t;
      }
    }

    return result;
  }
}
