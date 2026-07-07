class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        my = {}

        for i in range(len(nums)):
            diff = target - nums[i]

            if diff in my:
                return [my[diff], i]

            my[nums[i]] = i