package Easy;

/*
Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.
You can return the answer in any order.

Example 1:
Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:
Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:
Input: nums = [3,3], target = 6
Output: [0,1]
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TowSum {
        private final int[] nums;
        private final int target;

        public TowSum(int[] nums, int target) {
                this.nums = nums;
                this.target = target;
        }

        public int[] offerSolution() {
                Map<Integer, Integer> preElements = new HashMap<>();

                for (int i = 0; i < nums.length; ++i) {
                        int remainingNum = target - nums[i];
                        if(preElements.containsKey(remainingNum))
                                return new int[]{preElements.get(remainingNum), i};
                        preElements.put(nums[i], i);
                }

                return new int[]{};
        }

        public int[]offerSolution2() {
                Map<Integer, Integer> preElements = new HashMap<>();

                for (int i = 0; i < nums.length; ++i) {
                        Integer valIdx = preElements.get(nums[i]);
                        if (valIdx != null)
                                return new int[]{valIdx, i};
                        preElements.put(target-nums[i], i);
                }

                return new int[]{};
        }

        public static void main(String[] args) {
                TowSum tsProblem = new TowSum(new int[]{3,2,4}, 6);

                int[] res = tsProblem.offerSolution();
                System.out.println(Arrays.toString(res));
        }
}
