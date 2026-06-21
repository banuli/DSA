class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        // Hash map freq
        HashMap<String,Integer> hm = new HashMap<>();
        for(int i=0;i<words.length;i++){
          
            hm.put(words[i],hm.getOrDefault(words[i],0)+1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>((a,b)->{

            if(hm.get(a) == hm.get(b)){
                return (a.compareTo(b));
            }else{
                return (hm.get(b)-hm.get(a));
            }
        });

        pq.addAll(hm.keySet());

        // output 
        List<String> ans = new ArrayList<>();
        int i=0;
        while(i<k){
            ans.add(pq.poll());
            i++;
        }
        return ans;

    }
}