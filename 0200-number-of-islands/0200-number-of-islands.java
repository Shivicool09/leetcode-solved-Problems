class Solution {
    static class Pair{
        int row;
        int col;
        public Pair(int row, int col){
            this.row=row;
            this.col=col;
        }
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;

        boolean vis[][]=new boolean[n][m];

        int delRow[] = {-1, 0, 0, 1};
        int delCol[] = {0, 1, -1, 0};

        int startRow= 0;
        int startCol= 0;
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !vis[i][j]){
                    count++;
                    bfs(grid, vis, i, j, delRow, delCol);
                }
            }
        }
        return count;
    }
    private void bfs(char grid[][] , boolean vis[][], int row, int col, int delRow[], int delCol[]){
        vis[row][col]=true;

        int n=grid.length;
        int m=grid[0].length;

        Queue<Pair> q= new LinkedList<>();
        q.add(new Pair(row,col));
        while(!q.isEmpty()){
            int first= q.peek().row;
            int second= q.peek().col;
            q.remove();

            for(int i=0;i<4;i++){
                int newRow= first + delRow[i];
                int newCol= second + delCol[i];

                if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m
                 && grid[newRow][newCol]=='1' && !vis[newRow][newCol]){
                     vis[newRow][newCol]=true;
                     q.add(new Pair(newRow, newCol));
                 }
            }
        }
    }
}