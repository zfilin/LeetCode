package ua.com.unicatstudio.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P0014_LongestCommonPrefixTest {

    @Test
    void longestCommonPrefix() {

        String result = new P0014_LongestCommonPrefix().longestCommonPrefix(new String[]{"abcxyz", "ab","abcdef"});
        assertEquals("ab", result);

    }
}