class Solution(object):
    def findMaxAverage(self, nums, k):
        sums=0
        if(len(nums)<=k):
            for i in range(len(nums)):
                sums+=nums[i]
            return float(sums)/len(nums)
        else:
            j=0
            res=[]
            for i in range(k):
                sums=sums+nums[i]
            res.append(sums)   
            for i in range(k,len(nums)):
                sums=sums+nums[i]-nums[j]
                res.append(sums)
                j+=1
        
        return float(max(res))/k
       
  

        






       