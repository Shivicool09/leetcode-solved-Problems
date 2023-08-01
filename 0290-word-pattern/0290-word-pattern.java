class Solution {
    public boolean wordPattern(String pattern, String s) {
        Map<Object, Integer> map = new HashMap<>(); 
        String[] words = s.split(" ");
        if(pattern.length() != words.length) return false;
        for(Integer i = 0; i < words.length; i++){
            if(map.put(words[i], i) != map.put(pattern.charAt(i), i)) return false;   
        }
        return true;   
        
    }
    }
