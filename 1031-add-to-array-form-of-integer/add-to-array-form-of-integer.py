class Solution(object):
    def addToArrayForm(self, num, k):
        """
        :type num: List[int]
        :type k: int
        :rtype: List[int]
        """
        s=int("".join(map(str,num)))
        s=s+k
        res=[int(d) for d in str(s)]
        return res