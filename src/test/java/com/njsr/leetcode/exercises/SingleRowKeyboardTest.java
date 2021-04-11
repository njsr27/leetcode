package com.njsr.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleRowKeyboardTest {

  @Test
  public void Test1() {
    assertEquals(
      4,
      SingleRowKeyboard.calculateTime("abcdefghijklmnopqrstuvwxyz", "cba")
    );
  }

  @Test
  public void Test2() {
    assertEquals(
      73,
      SingleRowKeyboard.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode")
    );
  }

}
