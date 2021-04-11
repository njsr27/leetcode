package com.njsr.leetcode.exercises;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Given a stream of integers and a window size, calculate the moving average of all integers in the sliding window.
 * <p>
 * Implement the MovingAverage class:
 * <p>
 * MovingAverage(int size) Initializes the object with the size of the window size.
 * double next(int val) Returns the moving average of the last size values of the stream.
 */
public class MovingAverage {

  private final Integer size;
  private final Queue<Integer> window;
  private double total;

  public MovingAverage(int size) {
    this.size = size;
    this.window = new LinkedList<>();
    this.total = 0;
  }

  public double next(int val) {
    if (window.size() >= size) {
      total -= window.poll();
    }
    window.add(val);
    total += val;

    return total / window.size();
  }

}