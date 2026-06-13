class Solution {
    public int maxSubArrayLen(int[] nums, int k) {

        // its hashmap plus prefix sum method
        int cursum = 0;
        int maxlen = 0;

        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            cursum += nums[i];

            // either the cur sum = k, or cursum-k is already on the array
            if(cursum == k){
                maxlen = i+1;
            }else if(hm.containsKey(cursum-k)){
                maxlen = Math.max(maxlen,i - hm.get(cursum-k));
            }

            // as we want maxsize only update new values
            if(!hm.containsKey(cursum)){
                hm.put(cursum,i);
            }
        }
        return maxlen;
    }
}