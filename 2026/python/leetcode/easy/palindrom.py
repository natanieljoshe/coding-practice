class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x < 0 or (x!=0 and x %10 ==0 ):
            return False
        
        penampungReverse=0

        while penampungReverse < x:
            penampungReverse = (penampungReverse*10) + x%10
            x = x//10
        return x == penampungReverse or x == penampungReverse//10