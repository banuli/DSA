class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue<>();
    int globalK;
    public KthLargest(int k, int[] nums) {
        globalK = k;
        for(int val:nums){
            pq.add(val);
        }

        while(pq.size() > k){
            pq.poll();
        }
        
    }
    
    public int add(int val) {

        pq.add(val);
        while(pq.size() > globalK){
            pq.poll();
        }
        
        return pq.peek();
        
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */