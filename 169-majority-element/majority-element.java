class Solution {
    public int majorityElement(int[] nums) {
        
        int count =0;
        int val = nums[0];

        for(int num:nums){

            if(num == val){
                count++;
            }else{
                count--;
            }

            if(count==0){
                val=num;
                count=1;
            }
        }
        return val;
    }
}