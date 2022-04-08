package ua.com.unicatstudio.leetcode;

public class P0035_SearchInsertPosition {
  // https://leetcode.com/problems/search-insert-position/

  public int searchInsert(int[] nums, int target) {
    if (nums.length == 0) return 0;
    else if (nums[0] > target) return 0;
    else if (nums[nums.length-1] < target) return nums.length;

    int wStart = 0;
    int wEnd = nums.length;
    while ( wEnd - wStart > 1) {
      int wMid = (wEnd - wStart) / 2 + wStart;
      if ( target < nums[wMid] ) {
        wEnd = wMid;
      } else {
        wStart = wMid;
      }
    }

    if (nums[wStart] == target) return wStart;
    else return wStart + 1;
  }
}
