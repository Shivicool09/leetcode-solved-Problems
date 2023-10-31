class Solution {
    public int jump(int[] nums) {
        int far=0;
        int cur=0;
        int jup=0;
        for(int i=0;i<nums.length-1;i++)
        {
            far=Math.max(far,nums[i]+i);
            if(cur==i)
            {
                cur=far;
                jup++;
            }
        }
        return jup;
    }
}