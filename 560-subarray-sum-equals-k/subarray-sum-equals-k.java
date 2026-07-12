class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;

        // prefix sum of array nums
        int[] pre = new int[n];
        pre[0] = nums[0];
        for(int i=1;i<n;i++){
            pre[i] = pre[i-1]+nums[i];
        }

        HashMap<Integer,Integer> hm = new HashMap<>();
        int count = 0;

        for(int i=0;i<n;i++){
            int val = pre[i];
            if(val == k){
                count++;
            }
            if(hm.containsKey(val-k)){
                count += hm.get(val-k);
            }

            hm.put(val,hm.getOrDefault(val,0)+1);
        }

        return count;
        
    }
}