class Solution {
    public boolean canJump(int[] nums) {

        int n= nums.length;
        int finalPosition = n-1;

        //go backward from the finalPosition -1 th index
        // and see if you can reach the final position from ther
        // if not move the idx--
        for(int i=n-2;i>=0;i--){

            if(nums[i] + i >= finalPosition){
                finalPosition = i;
            }
        } 
        
        return finalPosition ==0;
    }
}