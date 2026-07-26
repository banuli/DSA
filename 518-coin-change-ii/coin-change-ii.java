class Solution {
    
    public int noOfWays(int[] coins,int idx,int amount,int[][]dp){
        if(idx < 0 || amount < 0)return 0;
        if(amount ==0)return 1;

        // if value is already obtained
        if(dp[idx][amount] !=-1) return dp[idx][amount];

        int pick = noOfWays(coins,idx,amount-coins[idx],dp);
        int notpick = noOfWays(coins,idx-1,amount,dp);

        dp[idx][amount] = pick+notpick;
        return pick+notpick;
    }
    public int change(int amount, int[] coins) {
        if(amount ==0)return 1;
        int n = coins.length;
        int[][]dp = new int[n][amount+1];

        for(int i = 0;i<n;i++){
            Arrays.fill(dp[i],-1);
        }
        dp[0][0] = 0;

        noOfWays(coins,n-1,amount,dp);

        return dp[n-1][amount];
        
    }
}