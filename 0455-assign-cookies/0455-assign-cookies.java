class Solution {
    public int findContentChildren(int[] g, int[] s) {
          Arrays.sort(g);
          Arrays.sort(s);
        int count = 0;
        int i=0, j=0;
        int n = g.length;
        int m = s.length;
        if(m==0 || n==0)
            return 0;
        int maxSize = s[m-1];
        while(i<n && j<m) {
            if(s[j]>=g[i]) {
                count++;
                j++;
                i++;
            } else {
                if(g[i]>maxSize) {
                    break;
                }
                j++;
            }
        }
        return count;
        
    }
}