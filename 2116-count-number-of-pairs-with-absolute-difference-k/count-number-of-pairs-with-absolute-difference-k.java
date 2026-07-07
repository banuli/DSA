class Solution {
    public int countKDifference(int[] nums, int k) {

        // frequency map to get the nums value's frequency
        HashMap<Integer,Integer> freq = new HashMap<>();
        int count  = 0;
        // iterate through the array and get the +ve and -ve difference to 
        //see if the value exist in the freq
        for(int val:nums){
            if(freq.containsKey(val+k)){
                count += freq.get(val+k);
            }

            if(freq.containsKey(val-k)){
                count += freq.get(val-k);
            }

            freq.put(val,freq.getOrDefault(val,0)+1);
        }
        return count;
    }
}