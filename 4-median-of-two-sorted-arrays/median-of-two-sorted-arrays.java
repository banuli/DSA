class Solution {
    public double findMedianSortedArrays(int[] A, int[] B) {

        if(A.length>B.length){
            return findMedianSortedArrays(B, A);
        }
        int n = A.length;
        int m = B.length;
        int total = n+m;
        int left = total/2;

        int lo = 0;
        int hi = n;

        while(lo<=hi){

            int cntA = (lo+hi)/2;
            int cntB = left - cntA;

            int la = cntA-1;
            int ra = cntA;
            int lb = cntB-1;
            int rb = cntB;

            // for indexing out of bount issue
            int maxA = Integer.MIN_VALUE;
            int minA = Integer.MAX_VALUE;
            int maxB = Integer.MIN_VALUE;
            int minB = Integer.MAX_VALUE;

            if(la >= 0) maxA = A[la];
            if(ra < n) minA = A[ra];
            if(lb >=0) maxB = B[lb];
            if(rb < m) minB = B[rb];

            // now compare the median values
            if(maxA > minB){
                hi = cntA-1;
            }else if(maxB > minA){
                lo = cntA+1;
            }else{
                //if the median is correct 
                if(total%2 != 0){// odd element
                    return (double)Math.min(minA,minB);
                }else{
                    // calculate the media
                    int val1 = Math.max(maxA,maxB);
                    int val2 = Math.min(minA,minB);
                    return (double)(val1+val2)/2;
                }
            }
        }
        return (double)-1;
    }
}