package ua.com.unicatstudio.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class p009_PalindromeNumberTest {

    @Test
    void isPalindrome() {
        boolean result = new p009_PalindromeNumber().isPalindrome(1234321);
        assertTrue(result);
    }
}