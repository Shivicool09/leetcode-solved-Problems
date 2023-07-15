public class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        
        // Check if all characters are uppercase
        boolean allUpperCase = true;
        for (int i = 0; i < n; i++) {
            if (!isUpperCase(word.charAt(i))) {
                allUpperCase = false;
                break;
            }
        }
        if (allUpperCase) {
            return true;
        }
        
        // Check if all characters are lowercase
        boolean allLowerCase = true;
        for (int i = 0; i < n; i++) {
            if (!isLowerCase(word.charAt(i))) {
                allLowerCase = false;
                break;
            }
        }
        if (allLowerCase) {
            return true;
        }
        
        // Check if only the first character is uppercase
        if (isUpperCase(word.charAt(0))) {
            for (int i = 1; i < n; i++) {
                if (!isLowerCase(word.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
        
        return false;
    }
    
    public boolean isUpperCase(char ch) {
        return ch >= 'A' && ch <= 'Z';
    }
    
    public boolean isLowerCase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }
}
