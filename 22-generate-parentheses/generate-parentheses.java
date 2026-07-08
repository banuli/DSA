class Solution {
    List<String> result = new ArrayList<>();
    public void genPar(String s,int n, int open,int close){
        if(s.length() == 2*n && open == n && close == n){
            result.add(s);
            return;
        }

        // add open
        if(open < n){
            genPar(s+"(",n,open+1,close);
        }
        //add close
        if(close < open){
            genPar(s+")",n,open,close+1);
        }
    }
    public List<String> generateParenthesis(int n) {

        genPar("",n,0,0);

        return result;
        
    }
}