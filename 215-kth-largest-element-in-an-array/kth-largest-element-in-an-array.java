class Solution {
    public int findKthLargest(int[] nums, int k) {

        // will try using Max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int val:nums){
            pq.add(val);

        }

        while(k>1){
            pq.poll();
            k--;
        }

        return pq.peek();

        
    }
}