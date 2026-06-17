class Solution {
    public String frequencySort(String s) {
        
        HashMap<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }

        PriorityQueue<HashMap.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

        pq.addAll(hm.entrySet());

        StringBuilder sb = new StringBuilder();

        while(pq.size() > 0){
            HashMap.Entry<Character,Integer> temp = pq.poll();
            char ch = temp.getKey();
            int count = temp.getValue();

            while(count >0){
                sb.append(ch);
                count--;
            }

        }
        return sb.toString();
    }
}