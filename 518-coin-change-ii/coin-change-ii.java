class Solution {
    public int change(int amount, int[] coins) {
        int n = coins.length;

        // for each amount calculate the answer for all coins
        int[]dp = new int[amount+1];
        dp[0] = 1;

        for(int coin:coins){

            for(int amt= 1; amt <= amount ;amt++){
                if(coin <= amt){
                    dp[amt] += dp[amt-coin];
                }
            }

        }

        return dp[amount];
        
    }
}