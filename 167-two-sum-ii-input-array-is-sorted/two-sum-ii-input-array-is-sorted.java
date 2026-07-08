class Solution {
    public int[] twoSum(int[] A, int target) {
        int l =0;
        int r = A.length-1;
        int [] result = new int[2];

        while(l<r){
            if(A[l]+A[r] > target){
                r--;
            }else if(A[l] + A[r] < target){
                l++;
            }else{
                result[0] = l+1;
                result[1] = r+1;
                break;
            }
        }
        return result;
    }
}