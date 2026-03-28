class Solution(object):
    def sortColors(self, nums):
        z=0
        o=0
        t=0
        lst=[]
        for i in range(len(nums)):
            if nums[i]==0 :
                z=z+1
            elif nums[i]==1 :
                o=o+1
            elif nums[i]==2 :
                t=t+1       
        lst += [0] * z
        lst += [1] * o
        lst += [2] * t
        for i in range(len(nums)):
            nums[i] = lst[i]
        return nums
