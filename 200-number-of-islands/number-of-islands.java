class Solution {
    int[] dr = {-1,0,1,0};
    int[] dc = {0,1,0,-1};
    public void dfs(char[][] grid,int r, int c){
        grid[r][c] = '0';
        int n = grid.length;
        int m = grid[0].length;

        for(int i=0;i<4;i++){
            int newR = dr[i] + r;
            int newC = dc[i] + c;
            if(newR >= 0 && newR < n && newC >= 0 && newC < m && grid[newR][newC] == '1'){
                dfs(grid,newR,newC);
            }
        }
        return;

    }

    public int numIslands(char[][] grid) {
        
        int island = 0;
        int n = grid.length;
        int m = grid[0].length;

        // iterate through all the row-col and if you find 1 find all the 
        // adjacent 1 to get the island count
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){

                // if the its island go dfs
                if(grid[i][j] == '1'){
                    island++;
                    dfs(grid,i,j);
                }
            }
        }
        return island;
    }
}