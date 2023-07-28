class Solution {

    public String getRange(int start, int end) {
        if (start == end) return start + "";
        else return start + "->" + end;
    }

    public List<String> summaryRanges(int[] nums) {
        List<String> result = new LinkedList<String>();
        if (nums.length == 0) return result;
        int start = 0;
        int end = 0;
        int distance;
        for (int i = 1; i < nums.length; i++) {
            distance = i - start;
            if (nums[i] - nums[start] != distance) {
                result.add(getRange(nums[start], nums[end]));
                start = i;
                end = i;
            } else {
                end = i;
            }
        }
        
        result.add(getRange(nums[start], nums[end]));
        return result;
    }
}