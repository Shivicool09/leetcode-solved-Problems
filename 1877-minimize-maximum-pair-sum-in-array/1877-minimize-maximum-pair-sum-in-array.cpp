class Solution
{
public:
    int minPairSum(vector<int>& nums)
    {
        ios_base::sync_with_stdio(0);
        cin.tie(0);
        cout.tie(0);
       
        sort(nums.begin(),nums.end());
 
        int ans = 0 , n = nums.size();
        for(int i=0;i<n/2;i++) ans = max(ans,nums[i]+nums[n-1-i]);
 
        return ans;
    }
};