class Solution {
    public int numTrees(int n) {

        if(n==0||n==1) return 1;

        int[]dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;

        for(int num=2;num<=n;num++){
            for(int j = 0;j<num;j++){
                dp[num] += (dp[j] * dp[num-j-1]);
            }
        }
        return dp[n];
        
    }
}