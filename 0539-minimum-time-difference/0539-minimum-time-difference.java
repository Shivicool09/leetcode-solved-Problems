class Solution {
    public int findMinDifference(List<String> timePoints) {
        List<Integer> list = new ArrayList<>();
        for (String str : timePoints) {
            list.add(Integer.parseInt(str.charAt(0) + "" + str.charAt(1))
                    * 60 + Integer.parseInt(str.charAt(3) + "" + str.charAt(4)));
        }
        Collections.sort(list);
        int min = 24 * 60;
        for (int i = 1; i < list.size(); i++) {
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }
        min = Math.min(min, (24 * 60 - list.get(list.size() - 1)) + list.get(0));
        return min;
        
    }
}