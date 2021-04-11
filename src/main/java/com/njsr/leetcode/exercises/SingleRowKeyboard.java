package com.njsr.leetcode.exercises;

/**
 * There is a special keyboard with all keys in a single row.
 * <p>
 * Given a string keyboard of length 26 indicating the layout of the keyboard (indexed from 0 to 25).
 * Initially, your finger is at index 0. To type a character, you have to move your finger to the index of the desired character.
 * The time taken to move your finger from index i to index j is |i - j|.
 * <p>
 * You want to type a string word. Write a function to calculate how much time it takes to type it with one finger.
 * <p>
 * Constraints:
 * <p>
 * keyboard.length == 26
 * keyboard contains each English lowercase letter exactly once in some order.
 * 1 <= word.length <= 104
 * word[i] is an English lowercase letter.
 */
public class SingleRowKeyboard {

  /*public static int calculateTime(String keyboard, String word) {
    char[] wordArray = word.toCharArray();
    char[] keyboardArray = keyboard.toCharArray();
    int time = 0;
    int previousPosition = 0;
    int actualPosition = 0;

    for (char c : wordArray) {
      for (int j = 0; j < keyboardArray.length; j++) {
        if (c == keyboardArray[j]) {
          previousPosition = actualPosition;
          actualPosition = j;
          break;
        }
      }
      time += Math.abs(actualPosition - previousPosition);
    }

    return time;
  }*/

  public static int calculateTime(String keyboard, String word) {
    int time = 0;
    int previousPosition;
    int actualPosition = 0;

    for (int i = 0; i < word.length(); i++) {
      previousPosition = actualPosition;
      actualPosition = keyboard.indexOf(word.charAt(i));

      time += Math.abs(actualPosition - previousPosition);
    }

    return time;
  }

}
