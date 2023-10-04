class Solution {
    public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];  
            currSum = prefixSum;  

            if (currSum > maxSum) {
                maxSum = currSum; 
            }

            if (prefixSum < 0) {
                prefixSum = 0;  
            }
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int maxSum = maxSubArray(nums);
        System.out.println("Max sum = " + maxSum);
    }
}
