package com.njsr.leetcode.exercises;

/**
 * Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
 * <p>
 * Return the running sum of nums.
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 1000
 * -10^6 <= nums[i] <= 10^6
 */
public class RunningSumOf1dArray {

  public static int[] runningSum(int[] nums) {
    int[] nums2 = new int[nums.length];
    int sum = 0;

    for (int i = 0; i < nums.length; i++) {
      nums2[i] = nums[i] + sum;
      sum += nums[i];
    }

    return nums2;
  }

}
