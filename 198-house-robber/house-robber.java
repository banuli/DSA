class Solution {
    public int rob(int[] nums) {

        // using DP trchnique
        int n = nums.length;

        if(n == 1 ){
            if(nums[0] > 0){
                return nums[0];
            }else{
                return 0;
            }
        }
        int[]dp = new int[n];

        // populate the first 2 index to build the logic
        if(nums[0] > 0){
            dp[0] = nums[0];
        }
        if(dp[0] > nums[1]){
            dp[1] = dp[0];
        }else{
            dp[1] = nums[1];
        }

        for(int idx=2;idx<n;idx++){
            int pick = nums[idx] + dp[idx-2];
            int notpick = dp[idx-1];

            dp[idx] = Math.max(pick,notpick);
        }

        return dp[n-1];
        
    }
}