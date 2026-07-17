class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int ans = 0;
        int[] left  = new int[n];
        int[] right = new int[n];

        Arrays.fill(left,1);
        Arrays.fill(right,1);

        // now check for left from its left neighbour
        for(int i=1;i<n;i++){
            if(ratings[i] > ratings[i-1]){
                left[i] = left[i] + left[i-1];
            }
        }

        // check for all values to its right
        for(int i=n-2;i>=0;i--){
            if(ratings[i] > ratings[i+1]){
                right[i] = right[i] + right[i+1];
            }
        }

        // from both left and right sum up all maximum values
        for(int i=0;i<n;i++){
            ans += Math.max(left[i],right[i]);
        }

        return ans;
        
    }
}