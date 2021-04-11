package com.njsr.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovingAverageFromDataStreamTest {

  @Test
  public void Test1() {
    MovingAverage movingAverage = new MovingAverage(3);
    assertEquals(1.0, movingAverage.next(1)); // return 1.0 = 1 / 1
    assertEquals(5.5, movingAverage.next(10)); // return 5.5 = (1 + 10) / 2
    assertEquals(4.66667, movingAverage.next(3)); // return 4.66667 = (1 + 10 + 3) / 3
    assertEquals(6.0, movingAverage.next(5)); // return 6.0 = (10 + 3 + 5) / 3
  }

}
