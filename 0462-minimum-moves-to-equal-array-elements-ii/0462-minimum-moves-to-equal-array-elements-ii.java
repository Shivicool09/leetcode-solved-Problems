import java.util.Arrays;

class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int l = nums.length;
        int n;
        if (l % 2 == 0) {
            n = l / 2;
        } else {
            n = (l + 1) / 2;
        }
        int k = nums[n - 1], j = 0;
        for (int i = 0; i < l; i++) {
            if (nums[i] < k) {
                j += (k - nums[i]);
            } else if (nums[i] > k) {
                j += (nums[i] - k);
            } else {
                if (nums[i] == k) {
                    j += 0;
                }
            }
        }
        return j;
    }
}