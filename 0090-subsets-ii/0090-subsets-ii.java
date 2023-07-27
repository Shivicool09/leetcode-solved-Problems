import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums); 
        backtrack(resultList, new ArrayList<>(), nums, 0);
        return resultList;
    }

    public void backtrack(List<List<Integer>> resultsets, List<Integer> tempset, int[] nums, int start) {
        resultsets.add(new ArrayList<>(tempset));
        for (int i = start; i < nums.length; i++) {
            // Skip duplicates
            if (i > start && nums[i] == nums[i - 1]) {
                continue;
            }
            tempset.add(nums[i]);
            backtrack(resultsets, tempset, nums, i + 1);
            tempset.remove(tempset.size() - 1);
        }
    }
}
