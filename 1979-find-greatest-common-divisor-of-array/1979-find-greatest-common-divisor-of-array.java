class Solution {
    public int findGCD(int[] nums) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        
        for (int i = min; i >= 2; i--) {
            if (min % i == 0 && max % i == 0) {
                return i;
            }
        }

        return 1;
        
    }
}