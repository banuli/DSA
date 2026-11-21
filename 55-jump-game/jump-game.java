class Solution {
    public boolean canJump(int[] nums) {
        
        int n = nums.length;
        int nextIdx = n-1;

        for(int i=n-2;i>=0;i--){

            // check if from the i th index you can reach nextIdx
            if(i+nums[i] >= nextIdx){
                nextIdx = i;
            }
        }

        return nextIdx ==0;
    }
}