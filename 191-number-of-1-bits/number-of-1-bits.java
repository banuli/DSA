class Solution {
    public int hammingWeight(int n) {
        
        int ans = 0;
        while(n>0){
            int val = n%2;
            ans+= val;
            n=n/2;
        }
        return ans;
    }
}