package ua.com.unicatstudio.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P0027_RemoveElementTest {

    @Test
    void removeElement() {
        int[] nums = new int[]{8, 2, 2, 3, 4, 4, 4, 4, 5};
        int[] expectedNums = new int[]{8, 2, 2, 3, 5};
        int result = new P0027_RemoveElement().removeElement(nums, 4);
        assertEquals(expectedNums.length, result);
        for (int i = 0; i < expectedNums.length; i++)
            assertEquals(expectedNums[i], nums[i]);

        nums = new int[]{0, 8, 0, 3, 0, 4, 0, 4, 5};
        expectedNums = new int[]{8, 3, 4, 4, 5};
        result = new P0027_RemoveElement().removeElement(nums, 0);
        assertEquals(expectedNums.length, result);
        for (int i = 0; i < expectedNums.length; i++)
            assertEquals(expectedNums[i], nums[i]);

    }
}