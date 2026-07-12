class Solution {
    public boolean isPossible(int[] price, int mid, int k){
        int n = price.length;

        // initialize the count as 1 as you will always pick
        // the absolute smallest price as it maximizes your choice

        int count = 1;
        int j = 0;
        for(int i=1;i<n;i++){
            if(price[i]-price[j] >= mid){
                count++;
                j=i;
            }
        }
        return count >= k;
    }
    public int maximumTastiness(int[] price, int k) {

        Arrays.sort(price);
        int n = price.length;
        int lo = 0;
        int hi = price[n-1];
        int ans = 0;
        
        while(lo <= hi){
            int mid = (lo+hi)/2;

            if(isPossible(price,mid,k)){
                ans = mid;
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }

        return ans;
        
    }
}