class Solution {
    public int coinChange(int[] coins, int amount) {

        int[] dp = new int[amount+1];
        Arrays.fill(dp,-1);
        dp[0] = 0;

        for(int amt = 1;amt <= amount;amt++){
            int ans = Integer.MAX_VALUE;
            for(int coin:coins){
                if(coin <= amt){
                    if(dp[amt-coin] != -1){
                        ans  = Math.min(ans,dp[amt-coin]);
                    }
                }
            }
            if(ans != Integer.MAX_VALUE){
                dp[amt] = ans+1;
            }
        }
        return dp[amount];
    }
}