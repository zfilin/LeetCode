package ua.com.unicatstudio.leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class P0020_ValidParenthesesTest {

    @Test
    void isValid() {
        boolean result = new P0020_ValidParentheses().isValid("[]({}()[()])");
        assertTrue(result);
    }
}