class Solution {
    public int[][] kClosest(int[][] points, int k) {

        int[][] ans  = new int[k][2];

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->b[0]-a[0]);

        for(int i=0;i<points.length;i++){
            int val = (points[i][0] * points[i][0]) + (points[i][1] * points[i][1]);
            pq.add(new int[]{val,i});

            if(pq.size() > k){
                pq.poll();
            } 
        }
        
        int i =0;
        while(pq.size() > 0){
            int[] val = pq.poll();
            ans[i] = points[val[1]]; 
            i++;
        }
        
        return ans;

    }
}