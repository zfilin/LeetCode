package ua.com.unicatstudio.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P0009_PalindromeNumberTest {

    @Test
    void isPalindrome() {
        boolean result;

        result = new P0009_PalindromeNumber().isPalindrome(1410110141);
        assertTrue(result);

        result = new P0009_PalindromeNumber().isPalindrome(123456);
        assertFalse(result);
    }
}