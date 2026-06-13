class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        int n = strs.length;
        HashMap<String,List<String>> hm = new HashMap<>();

        List<List<String>> ans = new ArrayList<>();

        for(int i=0;i<n;i++){
            String s = strs[i];
            char[] ch = s.toCharArray();

            //sort the array
            Arrays.sort(ch);
            //System.out.println(Arrays.toString(ch));
            //System.out.println(ch.toString());
            //String key = new String(ch);
            String key = Arrays.toString(ch);
            if(!hm.containsKey(key)){
                hm.put(key,new ArrayList<>());
            }
            hm.get(key).add(s);

        }

        for(String key:hm.keySet()){
            ans.add(new ArrayList<>(hm.get(key)));
        }
        return ans;

        //return new ArrayList<>(hm.values());
    }
}