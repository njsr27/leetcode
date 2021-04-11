package com.njsr.leetcode.exercises;

import java.util.HashMap;
import java.util.Map;

/**
 * Design a logger system that receives a stream of messages along with their timestamps.
 * Each unique message should only be printed at most every 10 seconds (i.e. a message printed at timestamp t will prevent
 * other identical messages from being printed until timestamp t + 10).
 * <p>
 * All messages will come in chronological order. Several messages may arrive at the same timestamp.
 * <p>
 * Implement the Logger class:
 * <p>
 * Logger() Initializes the logger object.
 * bool shouldPrintMessage(int timestamp, string message) Returns true if the message should be printed in the given timestamp, otherwise returns false.
 */
public class Logger {

  //If size is a problem, a type of history cleaning can be implemented
  private final Map<String, Integer> history;

  public Logger() {
    history = new HashMap<>();
  }

  /**
   * Returns true if the message should be printed in the given timestamp, otherwise returns false.
   * If this method returns false, the message will not be printed.
   * The timestamp is in seconds granularity.
   */
  public boolean shouldPrintMessage(int timestamp, String message) {
    if (history.get(message) == null) {
      history.put(message, timestamp);
    } else {
      if (timestamp - history.get(message) < 10) {
        return false;
      } else {
        history.put(message, timestamp);
      }
    }
    return true;
  }

}

/**
 * Your Logger object will be instantiated and called as such:
 * Logger obj = new Logger();
 * boolean param_1 = obj.shouldPrintMessage(timestamp,message);
 */