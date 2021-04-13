package com.njsr.leetcode.exercises;

import java.util.*;

/**
 * Design a Leaderboard class, which has 3 functions:
 * <p>
 * Initially, the leaderboard is empty.
 */
public class Leaderboard {

  private Map<Integer, Integer> scores; //playerId - score
  private PriorityQueue<Integer> top;

  public Leaderboard() {
    this.scores = new HashMap<>();
    this.top = new PriorityQueue<>(Comparator.reverseOrder()); //Can be improved using a TreeMap, with a score as key, and a counter as value
  }

  //* addScore(playerId, score): Update the leaderboard by adding score to the given player's score.
  // If there is no player with such id in the leaderboard, add him to the leaderboard with the given score.
  public void addScore(int playerId, int score) {
    if (!scores.containsKey(playerId)) {
      scores.put(playerId, score);
      top.add(score);
    } else {
      updatePlayerScore(scores.get(playerId), playerId, score);
    }
  }

  //* top(K): Return the score sum of the top K players.
  public int top(int K) {
    List<Integer> backup = new ArrayList<>();

    for (int i = 0; i < K; i++) {
      backup.add(top.remove());
    }

    top.addAll(backup);

    return backup.stream()
      .reduce(Integer::sum)
      .get();
  }

  //* reset(playerId): Reset the score of the player with the given id to 0 (in other words erase it from the leaderboard).
  // It is guaranteed that the player was added to the leaderboard before calling this function.
  public void reset(int playerId) {
    top.remove(scores.get(playerId));
    scores.remove(playerId);
  }

  private void updatePlayerScore(int oldScore, int playerId, int addedScore) {
    top.remove(oldScore);
    top.add(oldScore + addedScore);
    scores.put(playerId, oldScore + addedScore);
  }
}

/**
 * Your Leaderboard object will be instantiated and called as such:
 * Leaderboard obj = new Leaderboard();
 * obj.addScore(playerId,score);
 * int param_2 = obj.top(K);
 * obj.reset(playerId);
 */