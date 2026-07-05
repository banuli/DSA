class Solution {
    public int countPrimes(int n) {
        
        // base case
        if(n<=2)return 0;
        boolean[] isPrime = new boolean[n];

        Arrays.fill(isPrime,true);
        isPrime[0] = false;
        isPrime[1] = false;

        for(int i=2;i*i<n;i++){

            if(isPrime[i] == true){
                // populate the multiples as false
                for(int mul = i*i; mul<n; mul +=i){
                    isPrime[mul] = false;
                }
            }
        }
        int count = 0;
        // count the number of prime and return the answer
        for(int i=2;i<n;i++){
            if(isPrime[i])count++;
        }
        return count;
    }
}