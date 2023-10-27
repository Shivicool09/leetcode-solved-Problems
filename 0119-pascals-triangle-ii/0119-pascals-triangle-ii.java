class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>(rowIndex + 1);   
        long val = 1;  
        for (int i = 0; i <= rowIndex; i++) {
            row.add((int) val);
            val = val * (rowIndex - i) / (i + 1);
        }   
        return row;
        
    }
}