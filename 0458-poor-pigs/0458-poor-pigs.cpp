class Solution 
{
public:
    int poorPigs(int b, int d, int t) 
    {
        return ceil(log2(b)/log2((t/d)+1));
    }
};