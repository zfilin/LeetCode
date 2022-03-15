package ua.com.unicatstudio.leetcode;

public class p001_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        boolean isFound = false;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++)
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    isFound = true;
                    break;
                }
            if (isFound) break;
        }
        return result;
    }
}
