class Solution(object):
    def reversePrefix(self, s, k):
        res=str()
        p1=s[0:k]    
        p2=s[k:]
        rev=p1[::-1]
        res=rev+p2
        return res
      