class Solution {
    public boolean isUgly(int n) {
        if(n<=0)return false;
        
        // all divisors in an array
        int[] divisor = {2,3,5};

        for(int div:divisor){
            while(n%div == 0){
                n = n/div;
            }
        }
        return n==1;
        
    }
}