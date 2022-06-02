package ua.com.unicatstudio.leetcode;

public class P0069_SqrtX {
  // https://leetcode.com/problems/sqrtx/
  public int mySqrt(int x) {
    if (x == 0 || x == 1) {
      return x;
    }
    int top = Math.min(x, 46341);
    int btm = 1;
    int mid = top / 2;
    do {
      if (mid * mid > x) {
        top = mid;
      } else {
        btm = mid;
      }
      mid = (top - btm) / 2 + btm;
    } while (top != mid && btm != mid);
    return mid;
  }
}
