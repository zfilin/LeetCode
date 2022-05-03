package ua.com.unicatstudio.leetcode;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class P0058_LengthOfLastWordTest {

  @Test
  void lengthOfLastWord() {

    int result;

    result = new P0058_LengthOfLastWord().lengthOfLastWord("Hello world");
    assertEquals(5, result);

    result = new P0058_LengthOfLastWord().lengthOfLastWord("   fly me   to   the moon  ");
    assertEquals(4, result);

    result = new P0058_LengthOfLastWord().lengthOfLastWord("go");
    assertEquals(2, result);

  }
}