class Solution {
    public int minMeetingRooms(int[][] intervals) {
        int n = intervals.length;
        if(n==1) return 1;

        Arrays.sort(intervals,Comparator.comparingInt(a->a[0]));
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(intervals[0][1]);

        for(int i=1;i<n;i++){
            int startTime = intervals[i][0];
            int endTime = intervals[i][1];
            if(pq.peek() > startTime){
                pq.add(endTime);
            }else{
                pq.poll();
                pq.add(endTime);
            }
        }

        return pq.size();
    }

}