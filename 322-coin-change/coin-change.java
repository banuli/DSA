class Solution {
    public int coinChange(int[] coins, int amount) {
        int n = 0;

        // if its one coin and the coin is greater than the amount 
        if(n==1 && coins[0] < amount)return -1;

        int[]dp = new int[amount+1];

        // for each amount get the minimum number of coins that will be used
        for(int amt = 1;amt<=amount;amt++){
            int ans = Integer.MAX_VALUE;
            for(int coin:coins){
                if(amt - coin >=0 && dp[amt-coin] != Integer.MAX_VALUE){
                    ans = Math.min(ans,dp[amt-coin]+1);
                }
            }
            dp[amt] = ans;
        }
        return dp[amount]==Integer.MAX_VALUE?-1:dp[amount];
    }
}