class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if( n == 0 )
        {
            return 1 ;
        }
        if( n == 1)
        {
            return 10 ; 
        }
        int sum  = 9 ; 
        
        for( int i = 2 ;i <= n ;i++) 
        {
            sum = sum * (11 - i );
        }

        return sum + countNumbersWithUniqueDigits(n-1);
        
    }
}