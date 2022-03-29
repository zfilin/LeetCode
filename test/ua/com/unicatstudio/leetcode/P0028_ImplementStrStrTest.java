package ua.com.unicatstudio.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P0028_ImplementStrStrTest {

    @Test
    void strStr() {
        int result;

        result = new P0028_ImplementStrStr().strStr("mississippi", "sipp");
        assertEquals(6, result);

        result = new P0028_ImplementStrStr().strStr("123412345", "12345");
        assertEquals(4, result);

        result = new P0028_ImplementStrStr().strStr("ababac", "abac");
        assertEquals(2, result);

        result = new P0028_ImplementStrStr().strStr("Hello world", "ll");
        assertEquals(2, result);

        result = new P0028_ImplementStrStr().strStr("Hello world", "world");
        assertEquals(6, result);

        result = new P0028_ImplementStrStr().strStr("Hello world", "abc");
        assertEquals(-1, result);
    }
}