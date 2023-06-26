class Solution {
    public String convertToTitle(int columnNumber) {
         StringBuilder result = new StringBuilder();
        HashMap<Integer, Character> mapping = new HashMap<>();

        for (int i = 1; i <= 26; ++i) {
            mapping.put(i, (char)('A' + i - 1));
        }

        while (columnNumber > 0) {
            int remainder = (columnNumber - 1) % 26;
            char c = mapping.get(remainder + 1);
            result.insert(0, c);
            columnNumber = (columnNumber - 1) / 26;
        }

        return result.toString();
        
    }
}