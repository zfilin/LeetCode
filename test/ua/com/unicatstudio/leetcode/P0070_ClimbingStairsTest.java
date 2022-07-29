package ua.com.unicatstudio.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P0070_ClimbingStairsTest {

  @Test
  void climbStairs() {

    int result;

    result = new P0070_ClimbingStairs().climbStairs(1);
    assertEquals(1, result);

    result = new P0070_ClimbingStairs().climbStairs(3);
    assertEquals(3, result);

  }
}