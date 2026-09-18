class Solution {
    class pair{
        int row;
        int col;
        int time;
        public pair(int a,int b,int c){
            row = a;
            col = b;
            time = c;
        }
    }
    public int orangesRotting(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int fresh = 0;
        int ans = 0;

        Queue<pair> q = new LinkedList<>();

        // add all rotten orange as a pair with index and time to q
        // get all the fresh out of oranges
        for(int i = 0; i<n ; i++){
            for(int j = 0; j<m ; j++){
                if(grid[i][j] == 1)fresh++;
                if(grid[i][j] == 2){
                    // create a pair and add to q
                    pair p = new pair(i,j,0);
                    q.add(p);
                }
            }
        }

        //if(fresh ==0) return -1;

        // create a 4 direction array
        int[] dr = {0,-1,0,1};
        int[] dc = {-1,0,1,0};

        while(q.size() > 0){
            pair temp = q.poll();

            // check aroung the orange to mark them rotten
            for(int i=0;i<4;i++){
                int newRow = temp.row + dr[i];
                int newCol = temp.col + dc[i];
                int newTime = temp.time + 1;
                if(newRow >=0 && newRow < n && newCol >=0 && newCol < m && grid[newRow][newCol] == 1){
                    grid[newRow][newCol] = 2;
                    fresh--;
                    ans = newTime;
                    pair p = new pair(newRow,newCol,newTime);
                    q.add(p);
                }

            }
        }
        if(fresh > 0) return -1;
        return ans;
        
    }
}