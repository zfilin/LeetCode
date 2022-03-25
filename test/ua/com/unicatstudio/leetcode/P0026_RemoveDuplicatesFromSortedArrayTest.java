package ua.com.unicatstudio.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P0026_RemoveDuplicatesFromSortedArrayTest {

    @Test
    void removeDuplicates() {
        int[] nums = new int[]{1, 2, 2, 3, 4, 4, 4, 4, 5};
        int[] expectedNums = new int[]{1, 2, 3, 4, 5};
        int result = new P0026_RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        assertEquals(expectedNums.length, result);
        for (int i = 0; i < expectedNums.length; i++)
            assertEquals(expectedNums[i], nums[i]);

        nums = new int[]{1, 2, 3, 4, 5, 6};
        expectedNums = new int[]{1, 2, 3, 4, 5, 6};
        result = new P0026_RemoveDuplicatesFromSortedArray().removeDuplicates(nums);
        assertEquals(expectedNums.length, result);
        for (int i = 0; i < expectedNums.length; i++)
            assertEquals(expectedNums[i], nums[i]);

    }
}