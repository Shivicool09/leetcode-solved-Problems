class Solution {
    public char findTheDifference(String s, String t) {
        int sum1=0;
        int sum2=0;
        for(int i:s.toCharArray()){
            sum1+=i;
        }
        for(int j:t.toCharArray()){
            sum2+=j;
        }
        int res = sum2-sum1;
        char c = (char) res;
        return c;
        
    }
}