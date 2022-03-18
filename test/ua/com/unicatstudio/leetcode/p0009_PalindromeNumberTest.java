package ua.com.unicatstudio.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class p0009_PalindromeNumberTest {

    @Test
    void isPalindrome() {
        boolean result;

        result = new p0009_PalindromeNumber().isPalindrome(1410110141);
        assertTrue(result);

        result = new p0009_PalindromeNumber().isPalindrome(123456);
        assertFalse(result);
    }
}