package ua.com.unicatstudio.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class p0013_RomanToIntegerTest {

    @Test
    void romanToInt() {
        int result;

        result = new p0013_RomanToInteger().romanToInt("LVIII");
        assertEquals(58, result);

        result = new p0013_RomanToInteger().romanToInt("MCMXCIV");
        assertEquals(1994, result);
    }
}