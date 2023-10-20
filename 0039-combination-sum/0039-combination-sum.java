class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
         List<List<Integer>> result = new ArrayList<>();
        sum(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    public void sum(List<List<Integer>> result, List<Integer> current, int[] candidates, int target, int start) {
        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            if (candidates[i] <= target) {
                current.add(candidates[i]);
                sum(result, current, candidates, target - candidates[i], i);
                current.remove(current.size() - 1);
    }
        }
    }
}
