class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0 ; i< numRows;i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j == 0 || j == i){
                    l.add(1);
                }else{
                    int val = res.get(i-1).get(j-1) + res.get(i-1).get(j);
                    l.add(val);
                }
            }
            res.add(l);
        }

        return res;    
    }
}