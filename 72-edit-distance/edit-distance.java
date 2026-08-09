class Solution {
    public int minDistance(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int[][] dp = new int[m+1][n+1];

        // for  0th row of word 2 index every character add will be +1
        for(int i=1;i<=n;i++){
            dp[0][i] = dp[0][i-1]+1;
        }
        // for column of word 1
        for(int i = 1;i<=m;i++){
            dp[i][0] = dp[i-1][0]+1;
        }        

        // now for each row and column if the character matches, get the i-1,j-1, 
        // if the char does not match get the min from(i-1,j-1),(i-1,j),(i,j-1) and add 1
        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                char ch1 = word2.charAt(i-1);
                char ch2 = word1.charAt(j-1);
                if(ch1 == ch2){
                    dp[i][j] = dp[i-1][j-1];
                }else{
                    dp[i][j] = Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]))+1;
                }
            }
        }
        return dp[m][n];
    }
}