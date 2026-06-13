class Solution {
    public int findMaxLength(int[] nums) {

        // to solve this, we can change all 0's to -1 
        // that way we we sum equal no of 0's to 1is it will cancel out
        // use prefix sum logic same as continous sum subarry with 0
        int maxlen = 0;
        int pre = 0;

        // first make all 0's to -1
        for(int i=0;i<nums.length;i++){
            if(nums[i] ==0){
                nums[i] = -1;
            }
        }

        // store the prefix sum and index
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){

            pre += nums[i];

            if(pre == 0){
                maxlen = i+1;
            }

            if(hm.containsKey(pre)){
                maxlen = Math.max(maxlen, i-hm.get(pre));
            }else{
                hm.put(pre,i);
            }
        }
        return maxlen;
        
    }
}