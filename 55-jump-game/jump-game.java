class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;

        // greedy approch - final position as last index
        int finalPosition = n-1;

        // from index less than the final position see if you can reach the final position
        for(int i = n-2;i>=0;i--){

            // can we reach the current final position?
            if(nums[i] + i >= finalPosition){
                finalPosition = i;
            }
        }

        return finalPosition ==0;
    }
}