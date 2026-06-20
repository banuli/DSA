class Solution {
    public int singleNonDuplicate(int[] A) {
        int n = A.length;
        int lo = 0;
        int hi = n-2;

        // check edge cases
        if(n==1) return A[0];
        if(A[0]!=A[1]) return A[0];
        if(A[n-1] != A[n-2]) return A[n-1];

        while(lo <= hi){
            int mid = (lo+hi)/2;

            if(A[mid] != A[mid-1] && A[mid] != A[mid+1])return A[mid];

            if(A[mid] == A[mid-1]){
                mid = mid-1;
            }

            if(mid%2 == 0){
                // go left
                lo = mid+2;
            }else{
                hi = mid-1;
            }
        }
        return -1;
    }
}