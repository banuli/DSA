class Solution {
    public int candy(int[] ratings) {

        int n = ratings.length;
        if(n==1) return 1;

        int[] leftA = new int[n];
        int[] rightA = new int[n];

        Arrays.fill(leftA,1);
        Arrays.fill(rightA,1);

        // check all neighbours of left array
        for(int i=1;i<n;i++){
            if(ratings[i] > ratings[i-1]){
                leftA[i] = leftA[i-1]+1;
            }
        }

        // check all th right neighbours
        for(int i=n-2;i>=0;i--){
            if(ratings[i] > ratings[i+1]){
                rightA[i] = rightA[i+1] + 1;
            }
        }

        int ans = 0;
        for(int i=0;i<n;i++){
            ans += Math.max(leftA[i],rightA[i]);
        }

        return ans;
    }
}