class Solution {
    public boolean canAttendMeetings(int[][] intervals) {
        int n = intervals.length;
        if(n==1) return true;
        // sort the array with the start time
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));

        for(int i=1;i<n;i++){
            if(intervals[i-1][1] > intervals[i][0]){
                return false;
            }
        }

        return true;
    }
}