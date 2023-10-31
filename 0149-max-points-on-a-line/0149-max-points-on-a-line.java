class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if (n==1) return 1;

        int ans = 0;
        for (int i=0; i<n; i++) {
            Map<Double, Integer> map = new HashMap<>();
            for (int j=0; j<n; j++) {
                if (i==j) continue;

                int x1 = points[i][0], y1 = points[i][1];
                int x2 = points[j][0], y2 = points[j][1];

                double slope = x2 != x1 ? (double)(y2 - y1) / (x2 - x1) : Double.POSITIVE_INFINITY;

                map.put(slope, map.getOrDefault(slope, 1)+1);
            }
            ans = Math.max(ans, Collections.max(map.values()));
        }
        return ans;
    }
}