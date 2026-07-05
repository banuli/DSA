class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> grid = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
           l = new ArrayList<>();
           for(int j=0; j<=i ;j++){
                if(j==0 || j==i){
                    l.add(1);
                }else{
                    int val = grid.get(i-1).get(j-1)+grid.get(i-1).get(j);
                    l.add(val);
                }
           } 
           if(i == rowIndex)return l;
            grid.add(l);
        } 

        
        return l;
    }
}