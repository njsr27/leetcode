package com.njsr.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoggerTest {

  @Test
  public void Test1() {
    Logger logger = new Logger();
    assertTrue(logger.shouldPrintMessage(1, "foo"));
    assertTrue(logger.shouldPrintMessage(2, "bar"));
    assertFalse(logger.shouldPrintMessage(3, "foo"));
    assertFalse(logger.shouldPrintMessage(8, "bar"));
    assertFalse(logger.shouldPrintMessage(10, "foo"));
    assertTrue(logger.shouldPrintMessage(11, "foo"));
  }
  
}
