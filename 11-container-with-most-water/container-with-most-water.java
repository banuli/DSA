class Solution {
    public int maxArea(int[] height) {

        // use 2 pointer from left most and right most ans calculate the water
        int i = 0;
        int j = height.length-1;
        int maxCap = 0;
        while(i<j){
            int val = Math.min(height[i],height[j]);
            int width = j-i;

            int cap = val * width;
            maxCap = Math.max(cap,maxCap);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxCap;   
    }
}