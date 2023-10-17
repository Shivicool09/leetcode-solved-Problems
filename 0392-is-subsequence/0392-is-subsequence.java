class Solution {
    public boolean isSubsequence(String s, String t) {
         int count = 0;
        String longString = t;
        for(int i = 0; i < s.length(); i++) {
            if(longString.contains(s.charAt(i) + "")) {
                int pos = longString.indexOf(s.charAt(i) + "") + 1;
                count++;
                longString = longString.substring(pos);
            }
        }
        if(count == s.length()) return true;
        return false;
        
    }
}