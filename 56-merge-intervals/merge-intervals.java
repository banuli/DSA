class Solution {
    public int[][] merge(int[][] intervals) {
        // length
        int n = intervals.length;
        // sort the intervals by start 
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));

        //System.out.println(intervals.toString());
        List<int[]> arr = new ArrayList<>();
        int s = intervals[0][0];
        int e = intervals[0][1];
        int i = 1;
        while(i<n){
            if(intervals[i][0] <= e){
                s = Math.min(s,intervals[i][0]);
                e = Math.max(e,intervals[i][1]);
            }else{
                // add the new window
                int[] l = new int[2];
                l[0] = s;
                l[1] = e;
                arr.add(l);
                s = intervals[i][0];
                e = intervals[i][1];
            }
            i++;
        }
        // add the new window
        int[] l = new int[2];
        l[0] = s;
        l[1] = e;
        arr.add(l);


        return arr.toArray(new int[arr.size()][]);
    }
}