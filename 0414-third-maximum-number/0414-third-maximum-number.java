class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        int cnt=1;
        for(int i=nums.length-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                cnt=cnt+1;
            }
            if(cnt==3){
                return nums[i-1];
            }
        }
        return nums[nums.length-1];
        
    }
}