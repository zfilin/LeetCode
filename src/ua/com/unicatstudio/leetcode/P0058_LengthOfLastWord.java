package ua.com.unicatstudio.leetcode;

public class P0058_LengthOfLastWord {
  // https://leetcode.com/problems/length-of-last-word/

  public int lengthOfLastWord(String s) {
    s = s.stripTrailing();
    return s.length() - s.lastIndexOf(' ') - 1;
  }
}
