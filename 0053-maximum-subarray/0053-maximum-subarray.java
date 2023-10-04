class Solution {
    public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixSum = 0;

        for (int i = 0; i < nums.length; i++) {
            prefixSum += nums[i];  // Calculate the prefix sum up to the current index
            currSum = prefixSum;  // Reset the current sum to the current prefix sum

            if (currSum > maxSum) {
                maxSum = currSum;  // Update the maximum sum if needed
            }

            if (prefixSum < 0) {
                prefixSum = 0;  // Reset prefix sum to 0 if it becomes negative
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
