class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int n = matrix.length;
        int m = matrix[0].length;

        // will start from top left
        int i = 0;
        int j = m-1;

        while(i < n && j >=0){
            int val = matrix[i][j];
            if(target < val){
                // go left
                j--;
            }else if(target > val){
                // go dowm 
                i++;
            }if(target == val){
                return true;
            }
        }
        return false;
    }
}