class Solution {
    public int numDistinct(String s, String t) {

        // get the rows as source s
        // coulm as target t
        int m = s.length();
        int n = t.length();

        int[][] dp = new int [m+1][n+1];

        // from " " blank or and character source is I want a blank " " target 
        // there is 1 way ie by not choosing anything
        // so porulate the first cloumn with 1
        for(int i=0;i<=m;i++){
            dp[i][0]=1;
        }

        // for every row, if the column character match
        // sum the above 2 values as we want the previous sebsequeces formed
        // if it does not mtch just get the previous value
        for(int i=1;i<=m;i++){
            for(int j = 1;j<=n;j++){
                if(s.charAt(i-1) == t.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
                }else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[m][n];
        
    }
}