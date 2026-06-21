class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[] ans = new int[k];

        // populate into the hash map - frequency
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }

        // use a priority queue to sort the frequence
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b)->hm.get(b)-hm.get(a));

        pq.addAll(hm.keySet());

        int i=0;
        while(i<k){
            ans[i] = pq.poll();
            i++;
        }
        return ans;
        
    }
}