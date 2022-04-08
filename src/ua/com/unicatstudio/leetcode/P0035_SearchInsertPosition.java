package ua.com.unicatstudio.leetcode;

public class P0035_SearchInsertPosition {
  // https://leetcode.com/problems/search-insert-position/

  public int searchInsert(int[] nums, int target) {

    if (nums.length == 0) {
      return 0;
    } else if (nums[0] > target) {
      return 0;
    } else if (nums[nums.length - 1] < target) {
      return nums.length;
    }

    int winStart = 0;
    int winEnd = nums.length;
    while (winEnd - winStart > 1) {
      int winMid = (winEnd - winStart) / 2 + winStart;
      if (target < nums[winMid]) {
        winEnd = winMid;
      } else {
        winStart = winMid;
      }
    }

    if (nums[winStart] == target) {
      return winStart;
    } else {
      return winStart + 1;
    }
  }
}
