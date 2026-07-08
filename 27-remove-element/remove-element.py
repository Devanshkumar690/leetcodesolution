class Solution(object):
    def removeElement(self, nums, val):
         k = 0  
    
         for num in range(len(nums)):
             if nums[num] != val: 
                nums[k] = nums[num]
                k += 1
    
         return k    
            
      






