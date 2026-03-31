class Solution(object):
    def twoSum(self, nums, target):
        d = {i: val for i, val in enumerate(nums)} 
        
        arr = sorted(nums)  
        l, r = 0, len(arr) - 1
        lt = []

        while l < r:
            s = arr[l] + arr[r]

            if s == target:
                lt = [arr[l], arr[r]]
                break
            elif s < target:
                l += 1
            else:
                r -= 1

     
        result = []
        for val in lt:
            for k, v in d.items():
                if v == val and k not in result:
                    result.append(k)
                    break

        return result