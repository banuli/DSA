class Solution {
    public int findTargetSumWays(int[] nums, int target) {

        HashMap<Integer,Integer> sumCount = new HashMap<>();

        // put an entry for sum = 0; count = 1
        sumCount.put(0,1);

        // for every value in nums, add and subtract the value in sumCount
        for(int i: nums){
            HashMap<Integer,Integer> temp = new HashMap<>();
            for(HashMap.Entry<Integer,Integer> singleEntry : sumCount.entrySet()){
                int val = singleEntry.getKey();
                int count = singleEntry.getValue();

                // add +i and -i entries into temp
                temp.put(val+i,temp.getOrDefault(val+i,0)+count);
                temp.put(val-i,temp.getOrDefault(val-i,0)+count);
            }
            sumCount = temp;
        }
        return sumCount.getOrDefault(target,0);
    }
}