class Solution {
    public void sortColors(int[] A) {

        int lo = 0;
        int mid = 0;
        int hi = A.length-1;

        while(mid <= hi){

            if(A[mid] == 2){// swap with hi
                int temp = A[mid];
                A[mid] = A[hi];
                A[hi] = temp;
                hi--;
            }else if(A[mid] == 1){
                mid++;
            }else{
                int temp = A[mid];
                A[mid] = A[lo];
                A[lo] = temp;
                lo++;
                mid++;
            }
        }
        
    }
}