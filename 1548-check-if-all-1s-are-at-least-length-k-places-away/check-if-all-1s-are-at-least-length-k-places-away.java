class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int previous = -1;

        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                if(previous == -1){
                    previous = i;
                }else{
                    if((i-previous) <= k){
                        return false;
                    }else{
                        previous = i;
                    }
                }
            }
        }
        return true;
    }
}