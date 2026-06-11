class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxprofit = 0;
        int price = prices[0];

        
        for(int i = 1;i<n;i++){
            // new hight calculate the profit
            if(price < prices[i]){
                int profit = prices[i] - price;
                maxprofit = Math.max(maxprofit,profit); 
            }else{
                price = prices[i];
            }
        }
        return maxprofit;
    }
}