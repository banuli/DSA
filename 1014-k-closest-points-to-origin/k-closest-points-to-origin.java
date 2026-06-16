class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[][] ans = new int[k][2];
        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b) -> ((b[0] * b[0]+b[1]*b[1]) - (a[0]*a[0] + a[1]*a[1])));

        for(int []arr:points){
            pq.add(arr);

            if(pq.size() > k){
                pq.poll();
            }
        }
        
        int i = 0;
        // return answer array
        while(pq.size() > 0){
            ans[i] = (pq.poll());
            i++;
        }
        return ans;
    }
}