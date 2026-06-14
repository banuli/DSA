class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int zeros = 0;
        long ans = 0;

        for(int i:nums){
            if(i == 0){
                zeros++;
                ans += zeros;
            }else{
                zeros = 0;
            }
        }
        return ans;
    }
}