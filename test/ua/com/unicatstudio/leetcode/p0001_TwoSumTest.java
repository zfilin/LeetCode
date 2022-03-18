package ua.com.unicatstudio.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class p0001_TwoSumTest {

    @Test
    void twoSum() {
        int[] result = new p0001_TwoSum().twoSum(new int[]{1, 2, 3},5);
        assertArrayEquals(new int[]{1, 2}, result);
    }
}