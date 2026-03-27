class Solution(object):
    def detectCapitalUse(self, word):
        x=word[1:]
        if (  (word.isupper() or word.islower())   or   ( word[0].isupper() and x.islower()  ) ):
            return True
        
        else:
            return False   
        
        