class Solution {
    public int countKDifference(int[] nums, int k) {
        
        // frequency hash map
        HashMap<Integer,Integer> freq = new HashMap<>();
        int result = 0;

        // for all values get the absolute difference
        for(int val:nums){

            if(freq.containsKey(val + k)){
                result += freq.get(val+k);
            }
            if(freq.containsKey(val-k)){
                result += freq.get(val-k);
            }

            freq.put(val,freq.getOrDefault(val,0)+1);
        }

        return result;
    }
}