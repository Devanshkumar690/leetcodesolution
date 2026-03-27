

class Solution:
    def threeSumClosest(self, nums: List[int], target: int) -> int:
        nums.sort()
        
        closest_sum = 0
        min_diff = float('inf')

        for i in range(len(nums) - 2):
            l = i + 1
            r = len(nums) - 1

            while l < r:
                s = nums[i] + nums[l] + nums[r]
                diff = abs(s - target)

                if diff < min_diff:
                    min_diff = diff
                    closest_sum = s

                if s < target:
                    l += 1
                elif s > target:
                    r -= 1
                else:
                    return s   

        return closest_sum