package ua.com.unicatstudio.leetcode;

public class P0058_LengthOfLastWord {
  // https://leetcode.com/problems/length-of-last-word/

  public int lengthOfLastWord(String s) {
    int result = 0;
    char[] chars = s.toCharArray();
    boolean isWord = false;
    for (int i = chars.length - 1; i >= 0; i--) {
      if (chars[i] != ' ') {
        isWord = true;
      }
      if (isWord) {
        if (chars[i] == ' ') {
          return result;
        }
        result++;
      }
    }
    return result;
  }
}
