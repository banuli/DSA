class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length())return false;

        // HashMap<Character,Integer> hm = new HashMap<>();

        // for(int i=0;i<s.length();i++){
        //     char ch = s.charAt(i);
        //     hm.put(ch,hm.getOrDefault(ch,0)+1);
        // }
        

        // for(int i=0;i<t.length();i++){
        //     char ch = t.charAt(i);
        //     hm.put(ch,hm.getOrDefault(ch,0)-1);
        // }

        // for(char key:hm.keySet()){
        //     if(hm.get(key) != 0){
        //         return false;
        //     }
        // }
        // return true;

        // try solutio using fixed array length
        int[]l = new int[26];

        for(int i=0;i<s.length();i++){
            l[s.charAt(i)-'a']++;
        }

        for(int i=0;i<t.length();i++){
            l[t.charAt(i)-'a']--;
        }

        for(int i=0;i<l.length;i++){
            if(l[i]!=0) return false;
        }
        return true;
    }
}