class Solution {
    public int countSubstrings(String s) {

        int n = s.length();
        int count = 0;
        
        // to this count get all palandrome and add those values
        // for odd length
        for(int i=0;i<n;i++){
            int p1= i;
            int p2 = i;

            while(p1>=0 && p2<n && s.charAt(p1) == s.charAt(p2)){
                count++;
                p1--;
                p2++;
            }
        }

        // for even length
        for(int i=0;i<n-1;i++){
            int p1= i;
            int p2 = i+1;

            while(p1>=0 && p2<n && s.charAt(p1) == s.charAt(p2)){
                count++;
                p1--;
                p2++;
            }
        }

        return count;
    }
}