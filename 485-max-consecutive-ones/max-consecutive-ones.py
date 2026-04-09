class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        count=0
        maxi=0
        for num in nums:
            if num==1 :
                count+=1
                if maxi<count:
                    maxi=count
            else:
                count=0          
        return maxi

        
