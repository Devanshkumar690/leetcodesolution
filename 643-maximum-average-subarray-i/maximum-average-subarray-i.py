class Solution(object):
    def findMaxAverage(self, nums, k):
        sums=0
     
      
            
        for i in range(k):
            sums=sums+nums[i]
        maxi=sums 
        j=0
        for i in range(k,len(nums)):
            sums=sums+nums[i]-nums[j]
            if(maxi<sums):
                maxi=sums
            j+=1
        
        return float(maxi)/k
       
  

        






       