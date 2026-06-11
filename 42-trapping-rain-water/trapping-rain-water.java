class Solution {
    public int trap(int[] height) {

        int n = height.length;

        // left side highest wall
        int ls [] = new int[n];
        ls[0] = height[0];

        // right side highest wall
        int rs[] = new int[n];
        rs[n-1] = height[n-1];


        // left highest wall
        for(int i=1;i<n;i++){
            if(height[i] > ls[i-1]){
                ls[i] = height[i];
            }else{
                ls[i] = ls[i-1];
            }
        }
        
        // right highest wall
        for(int i=n-2;i>=0;i--){
            if(height[i] > rs[i+1]){
                rs[i] = height[i];
            }else{
                rs[i] = rs[i+1];
            }
        }

        int sum = 0;

        for(int i=0;i<n;i++){
            int h = Math.min(ls[i],rs[i]);
            int val = h - height[i];
            sum += val;
        }
        return sum;
    }
}