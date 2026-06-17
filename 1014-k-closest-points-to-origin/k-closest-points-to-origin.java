class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];

        // priority Queue max heap
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> (b[0]*b[0]+b[1]*b[1]) - (a[0]*a[0]+a[1]*a[1]));

        for(int[] ar: points){
            pq.add(ar);

            while(pq.size() > k){
                pq.poll();
            }
        }

        int i = 0;
        while(pq.size() > 0){
            ans[i] = pq.poll();
            i++;
        }
        return ans;
    }
    
}