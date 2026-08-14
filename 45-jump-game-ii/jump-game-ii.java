class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        int start =0;
        int end = 0;
        int jump = 0;
        int farthest = 0;

        while(farthest < n-1){
            farthest =0;
            for(int i=start;i<=end;i++){
                farthest = Math.max(farthest,nums[i] + i);
            }
            start = end+1;
            end = farthest;
            jump++;
        }
        return jump;
    }
}