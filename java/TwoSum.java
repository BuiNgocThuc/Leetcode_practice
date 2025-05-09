import java.util.HashMap;
import java.util.Map;

public class TwoSum {
        public int[] solution(int[] nums, int target) {
                Map<Integer, Integer> numMap = new HashMap<>();
                for (int i = 0; i < nums.length; i++) {
                        int remainingNum = target - nums[i];
                        if (numMap.containsKey(remainingNum)) {
                                return new int[] {numMap.get(remainingNum), i};
                        }
                        numMap.put(nums[i], i);
                }
                return new int[] {};
        }

        public static void main(String[] args) {
                TwoSum twoSum = new TwoSum();
                int[] nums = {2, 7, 11, 15};
                int target = 9;
                int[] result = twoSum.solution(nums, target);
                System.out.println("[" + result[0] + ", " + result[1] + "]");
        }
}