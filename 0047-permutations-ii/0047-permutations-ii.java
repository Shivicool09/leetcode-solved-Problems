import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        Arrays.sort(nums);
        backtrack(resultList, new ArrayList<>(), nums, new boolean[nums.length]);
        return resultList;
    }

    public void backtrack(List<List<Integer>> resultList, List<Integer> templist, int[] nums, boolean[] used) {
        if (templist.size() == nums.length) {
            resultList.add(new ArrayList<>(templist));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i] || (i > 0 && nums[i] == nums[i - 1] && !used[i - 1]))
                continue;

            used[i] = true;
            templist.add(nums[i]);

            backtrack(resultList, templist, nums, used);

            used[i] = false;
            templist.remove(templist.size() - 1);
        }
    }
}

   


