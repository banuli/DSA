class Solution {
    public int fib(int n) {
        if(n <= 1)return n;
        int fib = 0;
        int val1 = 0;
        int val2 = 1;
        for(int i=2;i<=n;i++){
            fib = val1+val2;
            val1 = val2;
            val2 = fib;
        }
        return fib;
    }
}