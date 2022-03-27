package ua.com.unicatstudio.leetcode;

public class P0026_RemoveDuplicatesFromSortedArray {
    // https://leetcode.com/problems/remove-duplicates-from-sorted-array/

    public int removeDuplicates(int[] nums) {
        int k = 0;
        for(int i = 1; i < nums.length; i++) {
            if (nums[k] != nums[i])
                if (++k < i) nums[k] = nums[i];
        }
        return k + 1;
    }
}
