import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), nums);
        return resultList;
    }

    public void backtrack(List<List<Integer>> resultList, ArrayList<Integer> templist, int[] nums) {
        if (templist.size() == nums.length) {
            resultList.add(new ArrayList<>(templist));
            return;
        }
        for (int number : nums) {
            if (templist.contains(number)) {
                continue;
            }

            templist.add(number);

            backtrack(resultList, templist, nums);

            templist.remove(templist.size() - 1);
        }
    }
}
