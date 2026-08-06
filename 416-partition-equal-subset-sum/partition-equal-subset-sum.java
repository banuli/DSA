class Solution {
    public boolean canPartition(int[] nums) {

        // check if the total sum is odd or even
        int totalSum = 0;
        for(int num:nums){
            totalSum += num;
        }
        if(totalSum%2 != 0) return false;

        int targetSum = totalSum/2;

        // create a dp of targetSum+1 with all false
        // DP[0] will be true as 0 sum is possible
        boolean[] dp = new boolean[targetSum+1];
        Arrays.fill(dp,false);
        dp[0] = true;

        // for all values in nums
        // check values from num to target sum by subtracting and is that value is found
        for(int val:nums){
            for(int curSum = targetSum; curSum >= val;curSum--){
                dp[curSum] = dp[curSum] || dp[curSum-val];
                if(dp[targetSum] == true) return true;
            }
        }
        return dp[targetSum];
    }
}