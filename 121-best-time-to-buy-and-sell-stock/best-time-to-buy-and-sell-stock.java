class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int ans = 0;
        if(n==1)return 0;

        int curMin= prices[0];

        for(int i=0;i<n;i++){
            curMin = Math.min(curMin,prices[i]);

            if(prices[i]>curMin){
                int val = prices[i]-curMin;
                ans = Math.max(ans,val);
            }
        }
        return ans;
    }
}