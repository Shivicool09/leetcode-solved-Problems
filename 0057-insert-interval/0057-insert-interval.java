class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
                if (intervals == null || intervals.length == 0 || intervals[0] == null || intervals[0].length == 0) {
            return new int[][]{newInterval};
        }
        boolean isInserted = false;
        int start = newInterval[0];
        int end = newInterval[1];
        List<int[]> temp = new ArrayList<>();
        for (int[] interval : intervals) {
            if (interval[1] < start) {
                temp.add(interval);
            } else if (interval[0] > end) {
                if (!isInserted) {
                    temp.add(new int[]{start, end});
                    isInserted = true;
                }
                temp.add(interval);
            } else {
                start = Math.min(start, interval[0]);
                end = Math.max(end, interval[1]);
            }
        }
        if (!isInserted) {
            temp.add(new int[]{start, end});
        }
        return temp.toArray(new int[0][]);

        
    }
}