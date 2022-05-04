package ua.com.unicatstudio.leetcode;

public class P0066_PlusOne {
  // https://leetcode.com/problems/plus-one/

  public int[] plusOne(int[] digits) {
    int i = digits.length - 1;
    while (i >= 0) {
      digits[i]++;
      if (digits[i] < 10) {
        return digits;
      }
      digits[i] = 0;
      i--;
    }
    digits = new int[digits.length + 1];
    digits[0] = 1;
    return digits;
  }
}
