class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == target) {
                    System.out.print("found at cell(" + i + "," + j + " )");
                    return true;
                }
            }
        }
        System.out.print("key not found");
        return false;
    }
}

   