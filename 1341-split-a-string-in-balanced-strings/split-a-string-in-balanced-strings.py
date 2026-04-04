class Solution(object):
    def balancedStringSplit(self, s):
        count=0
        r=0
        l=0
        for ch in s:
           
            if(ch=='R'):
                r+=1
            elif(ch=='L'):
                l+=1
            if(r==l):
                count+=1
        return count            

         
        