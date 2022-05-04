package ua.com.unicatstudio.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P0066_PlusOneTest {

  @Test
  void plusOne() {

    int[] digits = new int[]{1, 2, 2};
    int[] expectedDigits = new int[]{1, 2, 3};
    int[] result = new P0066_PlusOne().plusOne(digits);
    for (int i = 0; i < expectedDigits.length; i++)
      assertEquals(expectedDigits[i], result[i]);

    digits = new int[]{2, 7, 9};
    expectedDigits = new int[]{2, 8, 0};
    result = new P0066_PlusOne().plusOne(digits);
    for (int i = 0; i < expectedDigits.length; i++)
      assertEquals(expectedDigits[i], result[i]);

    digits = new int[]{9, 9, 9, 9, 9, 9};
    expectedDigits = new int[]{1, 0, 0, 0, 0, 0, 0};
    result = new P0066_PlusOne().plusOne(digits);
    for (int i = 0; i < expectedDigits.length; i++)
      assertEquals(expectedDigits[i], result[i]);

  }
}