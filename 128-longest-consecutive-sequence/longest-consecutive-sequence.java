class Solution {
    public int longestConsecutive(int[] nums) {
        int n = nums.length;

        int maxSeq = 0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<n;i++){
            hs.add(nums[i]);
        }

        for(int val:hs){   
          
            if(!hs.contains(val-1)){
                // check for sequence starting from val
                int count = 1; 
                while(hs.contains(val+1)){
                    count++;
                    val++;
                }
                maxSeq = Math.max(count,maxSeq);
            }
        }
        return maxSeq;
    }
}