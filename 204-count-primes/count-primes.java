class Solution {
    public Boolean isPrime(int n){
        int count =0;
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                count++;
                if(i != n/i){
                    count++;
                }
            }
        }
        if(count ==0 && n>1){
            return true;
        }
        return false;
    }
    public int countPrimes(int n) {
        int count = 0;
        // base case
        if(n==0 || n == 1) return 0;

        // array list to store all prime values
        List<Boolean> primes = new ArrayList<>(Collections.nCopies(n+1,true));
        

        for(int i=0;i*i <=n;i++){
            if(isPrime(i)){
                // populate all the nultiples of this as false
                int mul = i*i;
                while(mul <= n){
                    primes.set(mul,false);
                    mul += i;
                }
            }
        }

        for(int i=2;i<n;i++){
            if(primes.get(i) == true){
                count++;
            }
        }
        return count;
    }
}