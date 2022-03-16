package ua.com.unicatstudio.leetcode;

public class p009_PalindromeNumber {
    // https://leetcode.com/problems/palindrome-number/
    public boolean isPalindrome(int x) {
        int sourceX = x;
        long multiplier = 1;
        while (multiplier * 10 < x) multiplier *= 10;
        int resultX = 0;
        while(x > 0) {
            resultX += (x % 10) * multiplier;
            multiplier /= 10;
            x /= 10;
        }
        return (sourceX == resultX);
    }
}
