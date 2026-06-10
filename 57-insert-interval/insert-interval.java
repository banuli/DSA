class Solution {
    public int[][] insert(int[][] A, int[] newI) {

        // create a resultant array
        List<int[]> ans = new ArrayList<>();
        int n = A.length;
        int i = 0;

        // add all intervals less than new interval
        while(i<n && A[i][1] < newI[0]){
            ans.add(A[i]);
            i++;
        }

        // merge the new Interval
        while(i<n && A[i][0] <= newI[1]){
            newI[0] = Math.min(newI[0],A[i][0]);
            newI[1] = Math.max(newI[1],A[i][1]);
            i++;
        }

        ans.add(newI);

        // now add the rest of the windows
        while(i<n){
            ans.add(A[i]);
            i++;
        }

        return ans.toArray(new int[ans.size()][]);
        
    }
}