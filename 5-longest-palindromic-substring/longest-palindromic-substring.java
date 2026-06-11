class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        int n = s.length();
        int maxlen = 0;
        int l = 0;
        int r = 0;
        int len = 0;
        // for odd length
        for(int i=0;i<n;i++){
            int p1 = i;
            int p2 = i;
            
            while(p1>=0 && p2<n && (s.charAt(p1) == s.charAt(p2))){
                len = p2-p1+1;
                if(len > maxlen){
                    maxlen = len;
                    l = p1;
                    r = p2;
                }
                p1--;
                p2++;
            }   
        }

        // for even length
        for(int i=0;i<n-1;i++){
            int p1 = i;
            int p2 = i+1;
            
            while(p1>=0 && p2<n && (s.charAt(p1) == s.charAt(p2))){
                len = p2-p1+1;
                if(len > maxlen){
                    maxlen = len;
                    l = p1;
                    r = p2;
                    
                }
                p1--;
                p2++;
            }   
            
        }
        
        return s.substring(l,r+1);
    }
}