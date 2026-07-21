class Solution {
    public int numSquares(int n) {
        
        //using DP approch
        int[] dp = new int[n+1];
        dp[0] = 0;

        for(int num=1;num<=n;num++){
            int ans = Integer.MAX_VALUE;
            for(int j = 1;j*j<=num;j++){
                ans = Math.min(ans,dp[num-(j*j)]);
            }
            dp[num] = ans+1;
        }
        return dp[n];
    }
}