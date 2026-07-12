class Solution {
    public int findPairs(int[] nums, int k) {

        // hash map for frequencey
        HashMap<Integer,Integer> freq = new HashMap<>();
        int count = 0;

        for(int val:nums){
            freq.put(val,freq.getOrDefault(val,0)+1);
        }

        // loop through the freq keys to check if val+k is present
        for(int val:freq.keySet()){
            if((k != 0 && freq.containsKey(val+k)) ||(k == 0 && freq.get(val)>1)){
                count++;
            }
        }
        return count;
        
    }
}