class Solution {
    public String longestCommonPrefix(String[] strs) {

        // sort the array
        Arrays.sort(strs);
        int n = strs.length;
        if(n==1) return strs[0];

        String s1=strs[0];
        String s2 = strs[n-1];

        for(int i=0;i< Math.min(s1.length(),s2.length());i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                return s1.substring(0,i);
            }
        }

        return s1;
        
    }
}