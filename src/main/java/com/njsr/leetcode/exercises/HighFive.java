package com.njsr.leetcode.exercises;

import java.util.*;

/**
 * Given a list of the scores of different students, items, where items[i] = [IDi, scorei] represents one score from a student with IDi, calculate each student's top five average.
 * <p>
 * Return the answer as an array of pairs result, where result[j] = [IDj, topFiveAveragej] represents the student with IDj and their top five average.
 * Sort result by IDj in increasing order.
 * <p>
 * A student's top five average is calculated by taking the sum of their top five scores and dividing it by 5 using integer division.
 * <p><p>
 * Constraints:
 * <p>
 * 1 <= items.length <= 1000
 * items[i].length == 2
 * 1 <= IDi <= 1000
 * 0 <= scorei <= 100
 * For each IDi, there will be at least five scores.
 */
public class HighFive {

  public static int[][] highFive(int[][] items) {
    Map<Integer, List<Integer>> studentMap = new HashMap<>();
    int[][] studentTop5Avg;
    int auxIndex = 0;
    int max = 5;

    for (int[] item : items) {
      studentMap.computeIfAbsent(item[0], k -> new ArrayList<>());
      studentMap.get(item[0]).add(item[1]);
    }

    studentTop5Avg = new int[studentMap.size()][2];

    for (Integer studentId : studentMap.keySet()) {
      studentTop5Avg[auxIndex++] = new int[]{
        studentId,
        studentMap.get(studentId)
          .stream()
          .sorted(Comparator.reverseOrder())
          .limit(max)
          .reduce(Integer::sum)
          .map(sum -> sum / max)
          .get()
      };
    }

    return studentTop5Avg;
  }

}
