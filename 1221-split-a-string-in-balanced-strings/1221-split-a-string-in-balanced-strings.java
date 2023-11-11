class Solution {
    public int balancedStringSplit(String s) {
        
    int res =0;
    int lCount =0;
    int rCount = 0;
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)=='R')
        {
            rCount++;
        }else
        {
            lCount++;
        }
        if((lCount-rCount) == 0) 
        {
            res++;
            rCount = 0;
            lCount = 0;
        }
    }
    return res;
    }
}