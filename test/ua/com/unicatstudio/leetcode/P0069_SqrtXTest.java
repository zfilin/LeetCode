package ua.com.unicatstudio.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P0069_SqrtXTest {

  @Test
  void mySqrt() {
    int result;

    result = new P0069_SqrtX().mySqrt(2147395599);
    assertEquals(46339, result);

    result = new P0069_SqrtX().mySqrt(1);
    assertEquals(1, result);

    result = new P0069_SqrtX().mySqrt(15);
    assertEquals(3, result);

    result = new P0069_SqrtX().mySqrt(0);
    assertEquals(0, result);

    result = new P0069_SqrtX().mySqrt(7);
    assertEquals(2, result);

  }
}