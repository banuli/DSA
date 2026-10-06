class Solution {
    int[] dr = {-1,0,1,0};
    int[] dc = {0,1,0,-1};
    public void dfs(char[][] board, int row, int col){
        board[row][col] = 'T';
        int n = board.length;
        int m = board[0].length;

        for(int i=0;i<4;i++){
            int newR = row+dr[i];
            int newC = col+dc[i];

            // check if the row col is valid
            if(newR >=0 && newR<n && newC>=0 && newC < m && board[newR][newC] == 'O'){
                dfs(board,newR,newC);
            }
        }
        return;
    }

    public void solve(char[][] board) {
        int n = board.length;
        int m = board[0].length;

        //1- for all the borders if there is any O do a dfs and mark it as T
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                // check if its border
                if((i==0 || i == n-1|| j == 0 || j == m-1) && board[i][j] == 'O'){
                    dfs(board,i,j);
                }
            }
        }

        //2 - convert all O to X
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] =='O'){
                    board[i][j] = 'X';
                }
            }
        }

        // 3 - convert all T to O 
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j] =='T'){
                    board[i][j] = 'O';
                }
            }
        }  
        return;      
    }
}