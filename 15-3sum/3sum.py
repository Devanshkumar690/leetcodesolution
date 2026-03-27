class Solution:
    def threeSum(self, nums: list[int]) -> list[list[int]]:
        nums.sort()
        result = []
      
       
        for i in range(len(nums)-2):
            if( i>0 and nums[i]==nums[i-1]):
                continue
            res=-1*nums[i]
            l=i+1
            r=len(nums)-1
            while(l<r):
                s=nums[l]+nums[r]
                if(s==res):
                    result.append([nums[i], nums[l], nums[r]])
                    l=l+1
                    r=r-1
                    while(l<r and nums[l]==nums[l-1]):
                        l=l+1
                    while(l<r and nums[r]==nums[r+1]):
                         r=r-1
               
                elif(s<res):
                   l=l+1
                else:
                    r=r-1   
                
        return result



        

        