class Solution {
    public String frequencySort(String s) {

        // get all frequency of each character into a hm
        HashMap<Character,Integer> freq = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq.put(ch,freq.getOrDefault(ch,0)+1);

        }

        PriorityQueue<HashMap.Entry<Character,Integer>> pq = new PriorityQueue<>((a,b) -> b.getValue()-a.getValue());

        pq.addAll(freq.entrySet());

        StringBuilder sb = new StringBuilder();

        while(pq.size() > 0){
            HashMap.Entry<Character,Integer> hm = pq.poll();
            int val = hm.getValue();
            char ch = hm.getKey();
            while(val > 0){
                sb.append(ch);
                val--;
            }
        }

        return sb.toString();
    }
}