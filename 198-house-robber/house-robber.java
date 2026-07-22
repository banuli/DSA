class Solution {
    public int rob(int[] nums) {
        int n= nums.length;

        if(n==1) return nums[0];

        int[] dp = new int[n];

        // populate the first 2
        dp[0] = nums[0];
        if(nums[0] > nums[1]){
            dp[1] = nums[0];
        }else{
            dp[1] = nums[1];
        }

        //now use the last 2 indexes as we ieterate to get the maximum profit
        for(int i=2;i<n;i++){

            int pick = dp[i-2] + nums[i];
            int notpick = dp[i-1];

            dp[i] = Math.max(pick,notpick); 
        }
        return dp[n-1];

    }
}