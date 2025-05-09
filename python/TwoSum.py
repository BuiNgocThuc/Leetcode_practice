from typing import List


class TwoSum:
        def solution(self, nums: List[int], target: int) -> List[int]:
                num_map = {}
                for i, num in enumerate(nums):
                        remainingNum = target - num
                        if remainingNum in num_map:
                                return [num_map[remainingNum], i]
                        num_map[num] = i
                return []


if __name__ == "__main__":
        nums = [12, 7, 11, 15]
        target = 23
        two_sum = TwoSum()
        result = two_sum.solution(nums, target)
        print(result)
