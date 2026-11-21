class Solution {
    public int jump(int[] nums) {

        int n = nums.length;
        int fathest = 0;
        int start =0;
        int end = 0;
        int jumps = 0;

        while(fathest < n-1){
            fathest = 0;
            for(int i=start;i <= end ;i++){
                fathest = Math.max(fathest,nums[i]+i);
            }
            start = end+1;
            end = fathest;
            jumps++;
        }
        return jumps;
    }
}