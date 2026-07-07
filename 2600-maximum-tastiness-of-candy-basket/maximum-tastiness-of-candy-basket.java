class Solution {
    public boolean isPossible(int mid,int[] price, int k){
        int count = 1;
        int j =0;
        for(int i=1;i<price.length;i++){
            if(price[i]-price[j] >= mid){
                count++;
                j = i;
            }
        }
        return count >=k;
    }
    public int maximumTastiness(int[] price, int k) {

        Arrays.sort(price);
        int n = price.length;
        
        int lo = 0;
        int hi = price[n-1];
        int ans = 0;
        while(lo<=hi){
            int mid = lo + (hi-lo)/2;

            if(isPossible(mid,price,k)){
                ans = mid;
                lo = mid+1;
            }else{
                hi=mid-1;
            }
        }

        return ans;
        
    }
}