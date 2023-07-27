class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), nums, 0);
        return resultList;
    }

    public void backtrack(List<List<Integer>> resultsets, List<Integer> tempset, int[] nums, int start) {
        resultsets.add(new ArrayList<>(tempset));
        for (int i = start; i < nums.length; i++) {
            tempset.add(nums[i]);
            backtrack(resultsets, tempset, nums, i + 1);
            tempset.remove(tempset.size() - 1);
        }
    }
}

