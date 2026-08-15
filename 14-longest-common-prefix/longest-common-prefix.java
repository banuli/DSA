class Solution {
    public String longestCommonPrefix(String[] strs) {

     int n = strs.length;
     if(n==0) return "";

     int m = strs[0].length();

    // iterate through the first index string and compare with the rest
     for(int i =0;i<m;i++){
        char ch = strs[0].charAt(i);
        for(int j =0;j<n;j++){
            if(i == strs[j].length() || ch != strs[j].charAt(i)){
                return strs[0].substring(0,i);
            }
        }
     }

     return strs[0];   
    }
}