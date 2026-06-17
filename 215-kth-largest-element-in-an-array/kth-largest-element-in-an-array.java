class Solution {
    public int findKthLargest(int[] nums, int k) {

        if(nums.length <k) return -1;

        // max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i:nums){
            pq.add(i);
        }

        int i = 1;
        while(i < k){
            pq.poll();
            i++;
        }

        return pq.poll();
        
    }
}