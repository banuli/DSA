class Solution {
    public int removeElement(int[] nums, int val) {

        int count = 0;
        int idx = 0;
        for(int n:nums){
            if(n == val){
                count++;

            }else{
                nums[idx] = n;
                idx++;
            }
        }
        return idx;   
    }
}