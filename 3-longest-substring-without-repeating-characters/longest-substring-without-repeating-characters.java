class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> hs = new HashSet<>();

        int j=0;
        int maxlen = Integer.MIN_VALUE;

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(!hs.contains(ch)){
                hs.add(ch);
                maxlen = Math.max(maxlen,hs.size());
            }else{
                while(s.charAt(j) != ch){
                    hs.remove(s.charAt(j));
                    j++;
                }
                hs.remove(s.charAt(j));
                j++;
                hs.add(ch);
            }
        }
        return maxlen == Integer.MIN_VALUE? 0:maxlen;
        
    }
}