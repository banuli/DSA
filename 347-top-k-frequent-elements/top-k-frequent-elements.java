class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        int[] ans = new int[k];
        //using Hash map and priority Queue
        HashMap<Integer,Integer> hm = new HashMap<>();

        for(int i:nums){
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        
        // put this in a max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>((a,b) -> hm.get(b)-hm.get(a));

        pq.addAll(hm.keySet());
        
        int i = 0;
        while(i<k){
            ans[i] = pq.poll();
            i++;
        }
        return ans;
    }
}