class Solution {
    public boolean isAnagram(String s, String t) {
        int[] anagramChars=new int[26];
        if(s.length()!=t.length())
            return false;
        for(char c :s.toCharArray())
            anagramChars[c-'a']++;
            
             for(char c: t.toCharArray())
            anagramChars[c-'a']--;
                 
                 for(int n:anagramChars)
                     if(n!=0)
                         return false;
            
            return true;
        
    }
}