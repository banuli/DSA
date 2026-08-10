class Solution {
    public boolean canPartition(int[] nums) {

        int totalSum = 0;
        for(int num:nums){
            totalSum += num;
        }

        // if the total is odd then equal subset is not possible
        if(totalSum%2 != 0) return false;

        int targetSum = totalSum/2;

        // create boolean dp for the target sum and assign 0th index true
        boolean [] dp = new boolean[targetSum+1];
        Arrays.fill(dp,false);
        dp[0] = true;

        // 1- Outer loop over nums: Each number val is considered exactly once for updating the state array.
        // 2 - Backward iteration over curSum (targetSum down to val): Iterating backwards ensures that when computing dp[curSum], the value dp[curSum - val] comes from the previous iteration (before val was added), preventing val from being reused to compute larger sums in the same pass.
        for(int val:nums){
            for(int curSum = targetSum; curSum >= val;curSum--){
                dp[curSum] = dp[curSum] || dp[curSum - val];
            }
            if(dp[targetSum] == true) return true;
        }

        return dp[targetSum];
    }
}