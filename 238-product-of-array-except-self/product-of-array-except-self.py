class Solution(object):
    def productExceptSelf(self, nums):
        answer=[]
        
        product = 1
        for i in range(len(nums)):
            if nums[i] != 0:
                product = product * nums[i]
        b=product
        print(product) 
           
        a=nums.count(0)
        for i in range(len(nums)):
           
            if (a==0) :
                 answer.append(b // nums[i])
            elif (a==1):
                if(nums[i]==0):
                    answer.append(product)
                else:
                    answer.append(0)
                    
                    
            elif(a>1):
                return [0] * len(nums)
              
          
        return answer
nums = [1,2,3,4]
obj=Solution()
print(obj.productExceptSelf(nums))
       
    


        
            


        