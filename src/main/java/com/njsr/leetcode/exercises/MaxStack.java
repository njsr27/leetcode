package com.njsr.leetcode.exercises;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

/**
 * Design a max stack data structure that supports the stack operations and supports finding the stack's maximum element.
 * <p>
 * Implement the MaxStack class:
 * <p>
 */
public class MaxStack {

  private final LinkedList<Integer> stack;
  private final PriorityQueue<Integer> maxStack;

  // * MaxStack() Initializes the stack object.
  public MaxStack() {
    stack = new LinkedList<>();
    maxStack = new PriorityQueue<>(Comparator.reverseOrder());
  }

  // * void push(int x) Pushes element x onto the stack.
  public void push(int x) {
    maxStack.add(x);
    stack.addFirst(x);
  }

  // * int pop() Removes the element on top of the stack and returns it.
  public int pop() {
    int removedValue = stack.removeFirst();
    maxStack.remove(removedValue);
    return removedValue;
  }

  // * int top() Gets the element on the top of the stack without removing it.
  public int top() {
    return stack.peekFirst();
  }

  // * int peekMax() Retrieves the maximum element in the stack without removing it.
  public int peekMax() {
    return maxStack.peek();
  }

  // * int popMax() Retrieves the maximum element in the stack and removes it. If there is more than one maximum element, only remove the top-most one.
  public int popMax() {
    Integer removedElement = maxStack.remove();
    stack.remove(removedElement);
    return removedElement;
  }

}

/**
 * Your MaxStack object will be instantiated and called as such:
 * MaxStack obj = new MaxStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.peekMax();
 * int param_5 = obj.popMax();
 */