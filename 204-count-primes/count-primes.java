class Solution {
    public int countPrimes(int n) {

        // base case
        if(n<=2) return 0;

        //create a boolean array with n length and mark them as true
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2;i*i<n;i++){
            if(isPrime[i]){
                for(int mul = i*i; mul < n; mul += i){
                    isPrime[mul] = false;
                }
            }
        }

        // get the count of primes
        int count = 0;
        for(int i=2;i<n;i++){
            if(isPrime[i])count++;
        }
        return count;
    }
}