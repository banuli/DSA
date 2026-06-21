class Solution {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;

        int[] nsl = new int[n];
        Arrays.fill(nsl,-1);
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++){

            while(st.size()>0 && heights[st.peek()] >=heights[i]){
                st.pop();
            }
            if(st.size()>0){
                nsl[i] = st.peek();
            }
            st.push(i);
        }
        //System.out.println(Arrays.toString(nsl));
        while(st.size()>0){
            st.pop();
        }

        // populate nearest smaller on right
        int[] nsr = new int[n];
        Arrays.fill(nsr,n);

        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && heights[st.peek()] >= heights[i]){
                st.pop();
            }

            if(st.size()>0){
                nsr[i] = st.peek();
            }
            st.push(i);
        }
        //System.out.println(Arrays.toString(nsr));
        int ans = 0;
        for(int i=0;i<n;i++){
            int val = heights[i] *(nsr[i]-nsl[i]-1);
            ans = Math.max(ans,val);
        }
        return ans;
    }
}