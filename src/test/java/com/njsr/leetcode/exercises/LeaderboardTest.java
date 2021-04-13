package com.njsr.leetcode.exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LeaderboardTest {

  @Test
  public void Test1() {
    Leaderboard leaderboard = new Leaderboard();
    leaderboard.addScore(1, 73);   // leaderboard = [[1,73]];
    leaderboard.addScore(2, 56);   // leaderboard = [[1,73],[2,56]];
    leaderboard.addScore(3, 39);   // leaderboard = [[1,73],[2,56],[3,39]];
    leaderboard.addScore(4, 51);   // leaderboard = [[1,73],[2,56],[3,39],[4,51]];
    leaderboard.addScore(5, 4);    // leaderboard = [[1,73],[2,56],[3,39],[4,51],[5,4]];
    assertEquals(73, leaderboard.top(1));           // returns 73;
    leaderboard.reset(1);         // leaderboard = [[2,56],[3,39],[4,51],[5,4]];
    leaderboard.reset(2);         // leaderboard = [[3,39],[4,51],[5,4]];
    leaderboard.addScore(2, 51);   // leaderboard = [[2,51],[3,39],[4,51],[5,4]];
    assertEquals(141, leaderboard.top(3));           // returns 141 = 51 + 51 + 39;
  }

  /**
   * ["Leaderboard","addScore","addScore","addScore","addScore","addScore","addScore","addScore","addScore","addScore","addScore","top","top","top","reset","reset"]
   * [[],[1,82],[2,84],[3,47],[4,86],[5,92],[6,74],[7,34],[8,67],[9,76],[10,73],[4],[4],[8],[1],[2]]
   */
  @Test
  public void Test2() {
    Leaderboard leaderboard = new Leaderboard();

    leaderboard.addScore(1, 82);
    leaderboard.addScore(2, 84);
    leaderboard.addScore(3, 47);
    leaderboard.addScore(4, 86);
    leaderboard.addScore(5, 92);
    leaderboard.addScore(6, 74);
    leaderboard.addScore(7, 34);
    leaderboard.addScore(8, 67);
    leaderboard.addScore(9, 76);
    leaderboard.addScore(10, 73);

    assertEquals(344, leaderboard.top(4));
    assertEquals(344, leaderboard.top(4));
    assertEquals(634, leaderboard.top(8));

    leaderboard.reset(1);
    leaderboard.reset(2);
  }

  /**
   * ["Leaderboard","addScore","addScore","addScore","addScore","addScore","addScore","addScore","addScore","addScore","addScore","top","reset","reset","addScore","addScore","top","reset","reset","addScore","reset"]
   * [[],[1,13],[2,93],[3,84],[4,6],[5,89],[6,31],[7,7],[8,1],[9,98],[10,42],[5],[1],[2],[3,76],[4,68],[1],[3],[4],[2,70],[2]]
   */
  @Test
  public void Test3() {
    Leaderboard leaderboard = new Leaderboard();

    leaderboard.addScore(1, 13);
    leaderboard.addScore(2, 93);
    leaderboard.addScore(3, 84);
    leaderboard.addScore(4, 6);
    leaderboard.addScore(5, 89);
    leaderboard.addScore(6, 31);
    leaderboard.addScore(7, 7);
    leaderboard.addScore(8, 1);
    leaderboard.addScore(9, 98);
    leaderboard.addScore(10, 42);

    assertEquals(406, leaderboard.top(5));

    leaderboard.reset(1);
    leaderboard.reset(2);

    leaderboard.addScore(3, 76);
    leaderboard.addScore(4, 68);

    assertEquals(160, leaderboard.top(1));

    leaderboard.reset(3);
    leaderboard.reset(4);

    leaderboard.addScore(2, 70);

    leaderboard.reset(2);
  }
}
