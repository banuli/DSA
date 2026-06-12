class Solution {
    public int lengthOfLongestSubstringTwoDistinct(String s) {
        int n = s.length();
        int left = 0;
        int maxlen = 0;
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int right =0; right <n;right++){
            char ch = s.charAt(right);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
            
            // shrink from the left
            while(hm.size() > 2){
                char leftch = s.charAt(left);
                hm.put(leftch,hm.getOrDefault(leftch,0)-1);
                if(hm.get(leftch) ==0){
                    hm.remove(leftch);
                }
                left++;
            }
            maxlen = Math.max(maxlen,right-left+1);
        }
        return maxlen;
        
    }
}