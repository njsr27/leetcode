package com.njsr.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class HighFiveTest {

  @Test
  public void Test1() {
    assertArrayEquals(
      new int[][]{{1, 87}, {2, 88}},
      HighFive.highFive(
        new int[][]{{1, 91}, {1, 92}, {2, 93}, {2, 97}, {1, 60}, {2, 77}, {1, 65}, {1, 87}, {1, 100}, {2, 100}, {2, 76}}
      )
    );
  }

  @Test
  public void Test2() {
    assertArrayEquals(
      new int[][]{{1, 100}, {7, 100}},
      HighFive.highFive(
        new int[][]{{1, 100}, {7, 100}, {1, 100}, {7, 100}, {1, 100}, {7, 100}, {1, 100}, {7, 100}, {1, 100}, {7, 100}}
      )
    );
  }

}
