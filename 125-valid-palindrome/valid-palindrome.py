class Solution:
    def isPalindrome(self, s: str) -> bool:
        em=""
        s1=s.lower()
        for i in s1:
            if i.isalnum():
                em=em+i
            else:
                continue
        rev=em[::-1]
        if rev==em:
            return True
        else:
            return False