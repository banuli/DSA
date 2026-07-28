class Solution {
    public int coinChange(int[] coins, int amount) {

        // base case if amount is 0
        if(amount ==0)return 0;

        int n = coins.length;
        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1);
        dp[0] = 0;
        
        // for each amount get the minimum number of coins to use
        for(int amt = 1;amt<=amount;amt++){
            
            for(int i=0;i<n;i++){
                if(amt-coins[i] >=0){
                    dp[amt] = Math.min(dp[amt],dp[amt-coins[i]]+1);
                }
            }
        }

        return dp[amount]== amount+1? -1:dp[amount];
        
    }
}