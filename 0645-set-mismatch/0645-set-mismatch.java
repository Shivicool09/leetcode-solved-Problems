class Solution {
    public int[] findErrorNums(int[] nums) {
        int i = 0;
        int n = nums.length;
        while (i < nums.length){
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]){
                swap(nums, i, correct);
            }else {
                i++;
            }

            }
        i = 0;
        while (i < nums.length){
            if (nums[i] != i + 1){
                return new int[] {nums[i], i + 1};
            }
            i++;
        }
        return new int[] {- 1, -1};
    }
    public void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}