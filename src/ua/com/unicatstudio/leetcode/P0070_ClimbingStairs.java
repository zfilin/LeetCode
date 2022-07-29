package ua.com.unicatstudio.leetcode;

public class P0070_ClimbingStairs {
  // https://leetcode.com/problems/climbing-stairs/
  public int climbStairs(int n) {

    int x = 1;
    int y = 1;

    for (int i = 2; i < n + 1; i++) {
      y = x + y;
      x = y - x;
    }

    return y;

  }

}
