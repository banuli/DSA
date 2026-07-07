class Solution {
    public int findPairs(int[] nums, int k) {

        // get hash map with all the values frequency
        HashMap<Integer,Integer> freq = new HashMap<>();

        for(int i:nums){
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        int count = 0;
        // iterate through the freq key set to get the values
        for(int val:freq.keySet()){

            if((k > 0 && freq.containsKey(val+k)) || (k ==0 && freq.get(val) > 1)){
                count++;
            }
        }

        return count;
        
    }
}