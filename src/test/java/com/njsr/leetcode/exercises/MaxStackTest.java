package com.njsr.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxStackTest {

  @Test
  public void Test1() {
    MaxStack stk = new MaxStack();
    stk.push(5);   // [5] the top of the stack and the maximum number is 5.
    stk.push(1);   // [5, 1] the top of the stack is 1, but the maximum is 5.
    stk.push(5);   // [5, 1, 5] the top of the stack is 5, which is also the maximum, because it is the top most one.
    assertEquals(5, stk.top());     // return 5, [5, 1, 5] the stack did not change.
    assertEquals(5, stk.popMax());  // return 5, [5, 1] the stack is changed now, and the top is different from the max.
    assertEquals(1, stk.top());     // return 1, [5, 1] the stack did not change.
    assertEquals(5, stk.peekMax()); // return 5, [5, 1] the stack did not change.
    assertEquals(1, stk.pop());     // return 1, [5] the top of the stack and the max element is now 5.
    assertEquals(5, stk.top());     // return 5, [5] the stack did not change.
  }

}
