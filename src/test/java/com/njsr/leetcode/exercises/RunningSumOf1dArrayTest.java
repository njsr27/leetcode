package com.njsr.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RunningSumOf1dArrayTest {

  @Test
  public void Test1() {
    assertArrayEquals(
      new int[]{1, 3, 6, 10},
      RunningSumOf1dArray.runningSum(new int[]{1, 2, 3, 4})
    );
  }

  @Test
  public void Test2() {
    assertArrayEquals(
      new int[]{1, 2, 3, 4, 5},
      RunningSumOf1dArray.runningSum(new int[]{1, 1, 1, 1, 1})
    );
  }

  @Test
  public void Test3() {
    assertArrayEquals(
      new int[]{3, 4, 6, 16, 17},
      RunningSumOf1dArray.runningSum(new int[]{3, 1, 2, 10, 1})
    );
  }

}
