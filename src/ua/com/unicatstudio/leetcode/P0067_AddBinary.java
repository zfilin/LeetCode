package ua.com.unicatstudio.leetcode;

public class P0067_AddBinary {
  // https://leetcode.com/problems/add-binary/

  public String addBinary(String a, String b) {
    char[] charsA;
    char[] charsB;
    if (a.length() > b.length()) {
      charsA = a.toCharArray();
      charsB = b.toCharArray();
    } else {
      charsA = b.toCharArray();
      charsB = a.toCharArray();
    }

    char[] resultChars = new char[charsA.length + 1];
    int u = 0;
    int ib = charsB.length - 1;
    for (int ia = charsA.length - 1; ia >= 0; ia--) {
      int t = (charsA[ia] & 1) + (ib >= 0 ? charsB[ib--] & 1 : 0) + u;
      resultChars[ia + 1] = (char) ((t & 1) + 48);
      u = (t & 2) >> 1;
    }

    resultChars[0] = '1';
    return new String(resultChars, 1 - u, resultChars.length - (1 - u));
  }
}
