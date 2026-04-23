class Solution(object):
    def isPowerOfTwo(self, n):
        """
        :type n: int
        :rtype: bool
        """
        if n<=0:
            return False
        elif n==1:
            return True
        else:
            while n>1:
                if n%2!=0:
                    return False
                else:
                    return self.isPowerOfTwo(n//2)   

                
                
                    

        