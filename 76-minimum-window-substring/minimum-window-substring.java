class Solution {
    public String minWindow(String s, String t) {

        // base case
        if(s.length()<t.length())return "";

        // populate target string to mashmap
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch:t.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        int count = t.length();
        int l = 0; int minlen = Integer.MAX_VALUE;
        int start = 0 ;int end = 0;

        // iterate right
        for(int r=0;r<s.length();r++){
            char chr = s.charAt(r);
            
            if(hm.containsKey(chr)){
                if(hm.get(chr) > 0){
                    count--;
                }
                hm.put(chr,hm.getOrDefault(chr,0)-1);
            }

            while(count ==0){
                char chl = s.charAt(l);
                if(minlen > r-l+1){
                    minlen = r-l+1;
                    start = l;
                    end = r+1;
                }
                if(hm.containsKey(chl)){
                    hm.put(chl,hm.getOrDefault(chl,0)+1);
                    if(hm.get(chl) > 0){
                        count++;
                    }
                }
                l++;
            }
        }
        if(minlen == Integer.MAX_VALUE)return "";

        return s.substring(start,end);
    }
}